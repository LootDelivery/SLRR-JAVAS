package java.render;

import java.render.osd.*;
import java.render.osd.dialog.*;
import java.io.*;
import java.util.*;
import java.util.resource.*;

public class LoadingScreen extends Thread
{
	//loading:
	RenderRef		loadingObject;
	int				init;
	int				waitForUser;
	float			waitForUserTimeLimit;

	//dialogs:
	LoadingDialog	loadingDialog;

	Object			termSig = new Object();		//this object is notified on screen hides
	Thread			flashTextThread;


	public LoadingScreen()
	{
		start();
	}

	public void run()
	{
		while(1)
		{
			Frontend.render.wait();

			int kill;

			if( !init )
			{
				//amig tolt a rendszer
				if( !System.isLoading() )
					kill=1;
			}
			else
				--init;

			if( kill )
			{
				if( waitForUser )
				{
					if( loadingDialog )
					{
						if( loadingDialog.loadingText )
						{
							flashTextThread = new Thread( new FlashText( loadingDialog.loadingText ), "Dialog text flasher" );
							flashTextThread.start();
						}

						//kitesszuk a pointert is, hogy lehessen kattintani
						if( loadingDialog.flags&Dialog.DF_LEAVEPOINTER )
						{
							loadingDialog.flags&=~Dialog.DF_LEAVEPOINTER;
							loadingDialog.prevPointerState = Input.cursor.enable(1);
						}

						System.setLdPriority( System.LD_NORM );

						if( waitForUserTimeLimit >= 0.0 )
							new Thread( new SoftTimer( loadingDialog, waitForUserTimeLimit ), "SofTimer for the Loading dialog").start();

						loadingDialog.wait();

						if( flashTextThread )
						{
							flashTextThread.stop();
							flashTextThread = null;
						}
					}
				}

				hide();
				wait();
			}
			else
			{
				sleep(300);
			}
		}
	}

	//def loading pic
	public void	display()
	{
		show();
		userWait(0.0);
	}

	public void	display( LoadingDialog dlg )
	{
		display( dlg, 0.0 );
	}

	//shortcut dialogusok kidobalasahoz
	public void	display( LoadingDialog dlg, float waitForUserTimeLimit)
	{
		show( dlg );

		this.waitForUserTimeLimit = waitForUserTimeLimit;

		if( waitForUserTimeLimit )
			track(1);
		else
			track(0);

		termSig.wait();
	}

	public void	userWait()
	{
		userWait( -1.0 );
	}

	public void	userWait( float sec )	//var user nyomasara, max sec ideig
	{
		this.waitForUserTimeLimit = sec;
		track(sec);
		termSig.wait();
	}

	public void track()
	{
		track(0);
	}

	public void track( int waitForUser )
	{
		this.waitForUser = waitForUser;

		System.isLoadingReset();

		show();
		notify();	//(ujra)inditjuk a loading scannelo threadet
	}

	public void show( LoadingDialog dlg )
	{
		init = 1;
		if( !loadingDialog )
		{
			loadingDialog = dlg;
			loadingDialog.show();
			System.setLdPriority( System.LD_HIGH );
		}
	}

	public void show( ResourceRef pic )
	{
		show( new SimpleLoadingDialog( Dialog.DF_MODAL|Dialog.DF_FULLSCREEN|Dialog.DF_FREEZE|Dialog.DF_LEAVEPOINTER, pic ) );
	}

	public void show()
	{
		show( Frontend.defLoadingPic );
	}

	public void hide()
	{
		if( loadingDialog )
		{
			System.setLdPriority( System.LD_NORM );
			loadingDialog.hide();
			loadingDialog=null;

			termSig.notifyAll();
		}
	}
}

public class SoftTimer implements Runnable
{
	Object	listener;
	float	waitTime;

	public SoftTimer( Object listener_, float sec )
	{
		listener = listener_;
		waitTime = sec;
	}

	public void run()
	{
		Thread.sleep( waitTime * 1000 );
		listener.notify();
	}
}

public class FlashText implements Runnable
{
	Text flash;
	int	group;

	public FlashText( Text flash_ )
	{
		flash=flash_;
	}

	public void run()
	{
		while(1)
		{
			flash.changeText( "PRESS ENTER TO CONTINUE..." );
			Thread.sleep( 600 );

			flash.changeText( null );
			Thread.sleep( 600 );
		}
	}
}

