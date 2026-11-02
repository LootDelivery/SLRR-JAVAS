package java.render.osd;

import java.render.*;
import java.io.*;
import java.util.*;
import java.util.resource.*;

public class Slider extends Gadget
{
	Hotkey		hkl, hkr;

	float		x0, x1, y;
	float		value;

	float		a=0.0, b=1.0;	//range bounds
	int			ticks;			//0 - unlimited

	Label	vLabel;	//extra label for displayeing the value

	String	vFmt;

	Button	button;

	public Slider( Osd osd, Rectangle rect, PhysicsRef phy, float x0, float x1, float y, int command, Object handler )
	{
		super( osd, phy, rect, command, handler );

		this.x0 = x0;
		this.x1 = x1;
		this.y = y;

		noleaverelease=1;
	}

	//value label
	public void setVLabel( Text txt )
	{
		vLabel = new Label( txt );
	}

	public String getVLabelText()
	{
		if( vLabel )
			return vLabel.txt.text;

		return null;
	}

	public void changeVLabelText( String newtxt )
	{
		if( vLabel )
			vLabel.txt.changeText( newtxt );
	}

	public void changeVLabelColor( int newcolor )
	{
		if( vLabel )
			vLabel.txt.changeColor( newcolor );
	}
	//

	//ha engedelyezzuk folyamatosan kiirja a slider erteket
	public void printValue( String fmt )
	{
		vFmt = fmt;
		changeVLabelText( Float.toString( value, vFmt ) );
	}

	public void setRange( float a, float b )
	{
		this.a = a;
		this.b = b;
	}

	public void setTicks( int t )
	{
		ticks=t;
	}

	public void focus()
	{
		super.focus();

		//osd.actGadget = this;
		//mindegy, hogy statikus vagy nem, ugyis csak a slider focuszaltsaganak ideeig tart
		//es igy konnyebb eltavolitani is!
		hkl = osd.createHotkey( Input.AXIS_MENU_LEFT, Input.VIRTUAL|Osd.HK_STATIC, Osd.CMD_MENU_DEC|Osd.PRIVATEEVENT, null );
		hkr = osd.createHotkey( Input.AXIS_MENU_RIGHT, Input.VIRTUAL|Osd.HK_STATIC, Osd.CMD_MENU_INC|Osd.PRIVATEEVENT, null );
	}
	public void unfocus()
	{
		super.unfocus();

		osd.hotkey.removeElement( hkl ); hkl.inactivate(); hkl=null;
		osd.hotkey.removeElement( hkr ); hkr.inactivate(); hkr=null;
		//osd.actGadget = null;
	}

	public void sendMessage()
	{
		osd.sliderValue = value;
		super.sendMessage();
	}

	public void click( Gadget g )
	{
		Vector3 cv = Input.cursor.getPos();
		float val = a+(b-a)*osd.mapClickPosH( cv, x0, x1 );

		if( val != value )
		{
			setValue( val );
			sendMessage();
		}
	}

	public void increase()
	{
		float original = value;

		if( ticks > 1)
			setValue( value+(b-a)/ticks );
		else
			setValue( value+(b-a)*0.1 );

		if( value != original )
		{
			sendMessage();
		}
	}

	public void decrease()
	{
		float original = value;

		if( ticks > 1 )
			setValue( value-(b-a)/ticks );
		else
			setValue( value-(b-a)*0.1 );

		if( value != original )
		{
			sendMessage();
		}
	}


	public void setValue( float v )
	{
		if( a < b )
		{
			if( v > b )
				value = b;
			else
			if( v < a )
				value = a;
			else
				value = v;
		}
		else
		{
			if( v > a )
				value = a;
			else
			if( v < b )
				value = b;
			else
				value = v;
		}
		
		if( ticks > 1)
		{
			float tickRange = (b-a)/(ticks-1);
			int	castint = (value-a)/tickRange;
			float diff = (value-a) - tickRange*castint;
			if( diff > 0.0 )
			{
				if( diff < tickRange/2.0 )
					value = a+tickRange*castint;
				else
					value = a+tickRange*(castint+1);
			}
		}

		float dx = x0+((value-a)/(b-a))*(x1-x0);

		Vector3 pos = osd.convertTextCoordinates( dx, y, 1 );
		rect.setPos( pos );
		rect.setPos( pos );
		phy.setMatrix( pos, null );

		if( vFmt )
			changeVLabelText( Float.toString( value, vFmt ) );
	}

	public Vector3 getHotSpot()
	{
		return button.getHotSpot();
	}

}
