package java.render;

import java.render.osd.*;
import java.io.*;
import java.util.*;
import java.util.resource.*;

public class Group extends Dummy
{
	Osd	osd;
	int	active = 0;
	Vector	hotkey = new Vector();
	Vector	gadget = new Vector();

	public Group( Osd o )
	{
		super( o, WORLDTREEROOT );	//a group resource nodejat az osd node alatt hozzuk letre
		osd = o;

		activate();
	}

	public void finalize()
	{
		while( !hotkey.isEmpty() )
		{
			Hotkey hk =  hotkey.elementAt( 0 );
			hotkey.removeElementAt( 0 );
			hk.inactivate();
		}

		super.finalize();
	}

	public void activate()
	{
		if( !active )
		{
			active = 1;

			clearFlags( WORLDTREELEAF );

			setEventMask( EVENT_CURSOR );
			//Input.cursor.addHandler( this );	ez nem kell, a physicsinstanceok
			//									automatikusan kuldenek uzenetek a szulonek!

			for( int i=0; i<hotkey.size(); i++ )
			{
				Hotkey hk =  hotkey.elementAt( i );
				hk.activate();
			}
		}
	}

	public void deactivate()
	{
		if( active )
		{
			active = 0;

			//Input.cursor.remHandler( this );
			clearEventMask( EVENT_CURSOR );

			setFlags( WORLDTREELEAF );


			if( osd.pointedGadget && findGadget(osd.pointedGadget.phy.id()) )
				osd.deactivateText();

			for( int i=0; i<hotkey.size(); i++ )
			{
				Hotkey hk =  hotkey.elementAt( i );
				hk.inactivate();
			}
		}
	}

	public Gadget findGadget( int physicsId )
	{
		int i=gadget.size();
		Gadget g;

		while( i-- )
		{
			g = gadget.elementAt(i);
			if( g.phy && g.phy.id() == physicsId )	//pl a progressbarnak nincs phy-je
			{
				return g;
			}
		}

		return null;
	}

	public Gadget findGadgetEx( int physicsId )
	{
		ResourceRef parent;
		Object	instance;
		if( (parent = new ResourceRef( physicsId ).getParent()) && (instance = parent.getScriptInstance()) && instance instanceof Group )
		{
			return ((Group)instance).findGadget( physicsId );
		}

		return null;
	}

	//megszuri az inputot (lenyomom, kozben megnyilik egy modal, felengedem, click()! hiba)
	public int checkModality()
	{
		//igazabol az aktualis es a legutolso kozt mindet vegig kellene nezni, van-e egyetlen modal is!
		return osd.isFocused() || !Frontend.inputQueue.lastElement().flags&Osd.OF_MODAL ;
	}

	public void handleEvent(GameRef obj_ref, int event, String param)
	{
		int	ec = param.token(0).intValue();

		osd.lastUserActivityTimeStamp = System.currentTime();

		//button click kezeles:
		if (ec == EC_LDOWN)
		{
			int	physicsId = param.token(3).intValue();

			Gadget g = findGadget( physicsId );
	
			if( g )
				if( !g.disabled && !g.nofocus )
				{
					if( osd.actGadget )	//StringInput, etc lezarasa!
					{
						osd.actGadget.sendMessage();
						osd.actGadget=null;
					}

					g.press();

					if( g.noleaverelease )
						osd.clickLock = 1;

					osd.actDown = g;

					new SfxRef( Frontend.SFX_MENU_SELECT ).play(); 
				}
		}
		else
		if (ec == EC_LUP)
		{
			int	physicsId = param.token(3).intValue();

			Gadget g = findGadget( physicsId );
	
			if( g )
			{
				if( !g.disabled && !g.nofocus  && g.pressed )
				{
					g.release();
				}

				osd.clickLock = 0;
				osd.actDown = null;
			}
		}
		else
		if (ec == EC_LCLICK)
		{
			int	physicsId = param.token(2).intValue();

			Gadget g = findGadget( physicsId );
	
			if( g && !g.disabled )
			{
				if( checkModality() )
				{
					if( g.parent )
						g.parent.click( g );
					else
						g.click();	//CLICK->Press
				}
			}
		}
		else
		if (ec == EC_LDROP)
		{
			int	physicsId = param.token(2).intValue();
			int	physicsIdDragged = param.token(4).intValue();

			Gadget g = findGadget( physicsId );

			if( g && !g.disabled )
			{
				if( physicsId == physicsIdDragged )	//onmagat "dropoltak" ra
				{
					if( checkModality() )
					{
						if( g.parent )
							g.parent.click( g );
						else
							g.click();	//CLICK->Press
					}
				}
				else
				{
					Gadget dg = findGadgetEx( physicsIdDragged );
		
					if( g.dropEnabled )
					{
						if( dg )
						{
							g.drop( dg );
						}
						else
						{
							int gameInstanceId = param.token(3).intValue();
							g.drop( new GameRef( gameInstanceId ) );
						}
					}
				}
			}
		}
		else
		if( !osd.clickLock )	//lasd noleaverelease
		{
			//button mouse_over hilite kezeles
			if( ec == EC_HOVER )
			{
				int	moved = param.token(4).intValue();

				if( moved )	//felig oldja meg a problemat, mert legkozelebb ha megmozdul, mar nem kuld meg egy hovert..
							//mozdulast pedig nem figyelunk, tul sokat lassitana! :(
				{
					int	physicsId = param.token(3).intValue();

					Gadget g = findGadget( physicsId );

					if( g )
					{
						if( g.parent )
							g=g.parent;

						if( (!g.disabled || g.highliteMethod == Osd.HL_BACKLIGHT) && !g.nofocus )
						{
							osd.deactivateText();

							osd.activateText( this, g );
							osd.hoverEffect();
							new SfxRef( Frontend.SFX_MENU_MOVE ).play();

							if( osd.actDown == g )
							{
								g.press();
							}
						}


						osd.controlMode = 0;	//billentyus kontroll OFF!
					}
				}
			}
			else
			if( ec == EC_LEAVE )
			{
				int	physicsId = param.token(3).intValue();

				Gadget g = findGadget( physicsId );

				if( g )
				{
					if( g.parent )
						g=g.parent;

					if( g.pressed && !g.nofocus  )
					{
						g.release();
					}

					osd.deactivateText();
					osd.controlMode = 0;	//billentyus kontroll OFF!
				}
			}
		}
	}
}
