package java.render.osd.dialog;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;
import java.render.osd.*;

public class FileRequesterDialog extends OKCancelDialog
{
	final static int	MAX_ENTRIES = 5;
	final static int	CMD_ENTRIES = 100;

	String		path;
	String		mask;
	Button[]	fileButtons;

	String		fileName;
	Vector		fileNameList = new Vector();
	int			index;

	public FileRequesterDialog( Controller ctrl, int myflags, String mytitle, String OKButtonText, String path, String mask )
	{
		this( ctrl, myflags, mytitle, OKButtonText, path, mask, FindFile.FILES_ONLY );
	}
	public FileRequesterDialog( Controller ctrl, int myflags, String mytitle, String OKButtonText, String path, String mask, int ffFlags )
	{
		super( ctrl, myflags, mytitle, OKButtonText + ";Cancel", null );

		this.path = path;
		this.mask = mask;

		FindFile ff = new FindFile();
		String name=ff.first( path+mask, ffFlags );
		while( name )
		{
			if( validator( path + name ) )
				fileNameList.addElement( name );

			name = ff.next();
		}
		ff.close();
	}

	//--------------------------------------
	public int validator( String filename )
	{
		return 1;
	}
	//--------------------------------------


	public void show()
	{
		Style	sty;
		Menu	m;

		sty = new Style( 0.50, 0.12, Frontend.mediumFont, Text.ALIGN_CENTER, Osd.RRT_NONE/*new ResourceRef(frontend:0x00D8r)*/ );
		m = osd.createMenu( sty, 0.0, -0.55, 0.11 );	//spacing=0.1 ettol kisse egymasralognak, ami vonalazott eredmenyt ad

		fileButtons = new Button[MAX_ENTRIES];

		for( int i=0; i< MAX_ENTRIES; i++ )
		{
			fileButtons[i] = m.addItem( "", CMD_ENTRIES + i );	//fontos az ures string!
		}

		//filenev input mezo
		sty = new Style( 0.50, 0.12, Frontend.mediumFont, Text.ALIGN_CENTER, Osd.RRT_NONE );
		osd.createStringInput( sty, 0.0, 0.54, null, 200, "" );
		osd.createText( "FileName:", Frontend.mediumFont, Text.ALIGN_RIGHT, -0.50, 0.52 );

		//fel scroll gomb
		sty = new Style( 0.10, 0.10, 1.0, Frontend.smallFont, Text.ALIGN_CENTER, new ResourceRef( Osd.RID_ARROWUP ) );
		osd.createButton( sty, 0.55, -0.55, 201, null );

		//le scroll gomb
		sty = new Style( 0.10, 0.10, 1.0, Frontend.smallFont, Text.ALIGN_CENTER, new ResourceRef( Osd.RID_ARROWDN ) );
		osd.createButton( sty, 0.55,  0.25, 202, null );

		setButtonNames();

		super.show();
	}

	public void setButtonNames()
	{
		for( int i=0; i<MAX_ENTRIES; i++ )
			if( fileNameList.size() > index+i )
				fileButtons[i].changeLabelText( fileNameList.elementAt(index+i) );
			else
				fileButtons[i].changeLabelText( null );
	}


	public void	osdCommand( int cmd )
	{
		if( cmd >= CMD_ENTRIES && cmd < CMD_ENTRIES+MAX_ENTRIES )
		{
			cmd -= CMD_ENTRIES;
			fileName = fileButtons[cmd].getLabelText();

			osdCommand(0);
		}
		else
		if( cmd==200 )
		{
			fileName = osd.stringValue;
			if( !osd.actGadget )		//ha most veszti el a fokuszt
			{
				osdCommand( 0 );	//OK generated
			}
		}
		else
		if( cmd==201 )
		{
			if( index )
			{
				index -= MAX_ENTRIES;
				setButtonNames();		
			}
		}
		else
		if( cmd==202 )
		{
			if( index+MAX_ENTRIES < fileNameList.size() )
			{
				index += MAX_ENTRIES;
				setButtonNames();		
			}
		}
		else
		{
			if( cmd == 0 )	//OK ready?
			{
				if( !fileName || fileName.length() == 0 )
					return;	//no filename - eating up OK

				if( !validator( path + fileName ) )
				{
					if( !(flags & FRF_SAVE) )
					{	//egyeb - csak letezo filenevvel engedjuk ki
						new WarningDialog( controller, DF_HIGHPRI|DF_MODAL|DF_DEFAULTBG, title, "File system error." ).display();
						return;
					}
				}
				else
				{
					if( flags & FRF_SAVE )
					{	//save - feluliras megerositest kerunk
						if( new NoYesDialog( controller, DF_HIGHPRI|DF_MODAL|DF_DEFAULTBG, title, "Overwrite existing file?" ).display() )
							return;	//cancel - eating up OK
					}
				}
			}

			super.osdCommand( cmd );
		}
	}
}
