package java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart;

import java.render.osd.*;
import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.cars.*;
import java.game.parts.*;
import java.game.parts.bodypart.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.*;
import java.game.parts.rgearpart.*;

public class Transmission extends ReciprocatingEnginePart
{
	final static int	DT_FWD = 1;
	final static int	DT_RWD = 2;

	int	gears=0;
	float[]	ratio=new float[8];
	float	end_ratio=0.0;
	float	starter_torque=0.0;
	float	capacity=0.0;
	float	best_lubrication_sliction=1.0;
	float	worst_lubrication_sliction=1.0;
	int	adjustable_gears=0;

	float	drive_front_min = 0.0;
	float	drive_front_max = 0.0;
	float	def_drive_front = 0.0;
	float	drive_front = 0.0;
	int	drive_type = 0;

	float	def_diff_lock = 0.0;
	float	diff_lock = 0.0;
	float	diff_lock_min = 0.0;
	float	diff_lock_max = 1.0;

	public Transmission( int id )
	{
		super( id );

		name = "Transmission";

		ratio[0] = 0.0;
		ratio[7] = -0.0;

		prestige_calc_weight = 30.0;
	}

	public float getSlictionLoss()
	{
		return clampTo(worst_lubrication_sliction + getWear()*(best_lubrication_sliction-worst_lubrication_sliction),0.0,1.0);
	}

	public void fillDynoData( DynoData dd, int parentSlot )	//different in other (engine) part classes
	{
		super.fillDynoData( dd, parentSlot );

		if (the_car)
		{
			the_car.drive_type |= drive_type;

			WheelRef whl;
			int fwd = the_car.drive_type & DT_FWD;
			int rwd = the_car.drive_type & DT_RWD;

			whl = the_car.getWheel(0); // FL //
			if (whl && fwd)
				whl.setDrive(drive_front);

			whl = the_car.getWheel(1); // FR //
			if (whl && fwd)
				whl.setDrive(drive_front);

			whl = the_car.getWheel(2); // RL //
			if (whl && rwd)
				whl.setDrive(1.0-drive_front);

			whl = the_car.getWheel(3); // RR //
			if (whl && rwd)
				whl.setDrive(1.0-drive_front);

			the_car.diff_lock = diff_lock;
			the_car.updateDifflock();

			the_car.gears = gears;
			for (int i=0; i<8; i++)
				the_car.ratio[i] = ratio[i];
			the_car.rearend_ratio = end_ratio;
			the_car.starter_torque = starter_torque;
		}
	}

	public void load( File saveGame )
	{
		super.load( saveGame );

		int	save_ver = saveGame.readInt();

		if (save_ver >= 1)
		{
			int i;

			for (i=0; i<8; i++)
				ratio[i] = saveGame.readFloat();
			end_ratio = saveGame.readFloat();
		}

		if (save_ver >= 2)
		{
			diff_lock = saveGame.readFloat();
			drive_front = saveGame.readFloat();
		}
	}

	public void save( File saveGame )
	{
		super.save( saveGame );

		int	save_ver = 2;

		saveGame.write( save_ver );
		if (save_ver >= 1)
		{
			int i;

			for (i=0; i<8; i++)
				saveGame.write(ratio[i]);
			saveGame.write(end_ratio);
		}

		if (save_ver >= 2)
		{
			saveGame.write(diff_lock);
			saveGame.write(drive_front);
		}
	}

	//---------tuning
	int	adjustable_diff_lock;
	int	adjustable_drive;

	public int isTuneable()
	{
		adjustable_diff_lock=(diff_lock_min!=diff_lock_max);
		adjustable_drive=(drive_front_min!=drive_front_max);
		return (adjustable_gears || adjustable_diff_lock || adjustable_drive);
	}

	// backup values //
	float[]	old_ratio = new float[8];
	float	old_end_ratio;
	float	old_diff_lock;
	float	old_drive_front;
	float	rev_ratio;

	public void buildTuningMenu( Menu m )
	{
		int i;
		String gear_name = "";

		for (i=0; i<8; i++)
			old_ratio[i] = ratio[i];
		old_end_ratio = end_ratio;

		for (i=1; i<7; i++)
			ratio[i]=-ratio[i];

		old_diff_lock = diff_lock;
		old_drive_front = drive_front;

		if (adjustable_gears & 1) // forward gears //
		{
			for (i=1; i<=gears; i++)
			{
				if (i==1)
					gear_name = "1st";
				else
				if (i==2)
					gear_name = "2nd";
				else
				if (i==3)
					gear_name = "3rd";
				else
				if (i==4)
					gear_name = "4th";
				else
				if (i==5)
					gear_name = "5th";
				else
				if (i==6)
					gear_name = "6th";

				m.addItem( gear_name, i, ratio[i], -5.0, -0.5, 0, null ).changeVLabelText( Float.toString(-ratio[i], "%1.3f:1"));
			}
		}

		if (adjustable_gears & 2) // reversing gear //
		{
			m.addItem( "R", 7, ratio[7], -5.0, -0.5, 0, null ).changeVLabelText( Float.toString(ratio[7], "%1.3f:1"));
		}

		if (adjustable_gears & 4) // end ratio //
		{
			m.addItem( "End ratio", 8, end_ratio, 1.0, 8.0, 0, null ).changeVLabelText( Float.toString(end_ratio, "%1.3f:1"));
		}

		if (adjustable_diff_lock)
		{
			m.addItem( "Limited slip differential lock rate", 9, diff_lock, diff_lock_min, diff_lock_max, ((diff_lock_max-diff_lock_min)*100)+1, null ).changeVLabelText( Float.toString(diff_lock*100.0, "%1.0f%%"));
		}

		if (adjustable_drive)
		{
			m.addItem( "Drive distribution", 10, -drive_front, -drive_front_max, -drive_front_min, ((drive_front_max-drive_front_min)*100)+1, null ).changeVLabelText( Float.toString(drive_front*100.0, "%1.0f") + "/" + Float.toString((1.0-drive_front)*100.0, "%1.0f") + "% F/R" );
		}
	}

	public void endTuningSession( int cancelled )
	{
		int i;

		if( cancelled )
		{
			for (i=0; i<8; i++)
				ratio[i] = old_ratio[i];
			end_ratio = old_end_ratio;
			diff_lock = old_diff_lock;
			drive_front = old_drive_front;
		}
		else
		{
			for (i=0; i<8; i++)
				if (ratio[i] != old_ratio[i])
					break;

			if (i<8)
				GameLogic.spendTime(10*60+gears*2*60);

			if (old_diff_lock = diff_lock)
				GameLogic.spendTime(30*60);

			if (old_drive_front = drive_front)
				GameLogic.spendTime(30*60);

			for (i=1; i<=6; i++)
				ratio[i] = -ratio[i];
		}

		getCar_LocalVersion();
		if (the_car)
			the_car.forceUpdate();
	}

	public void handleMessage( Event m )
	{
		if( m.cmd >= 1 && m.cmd <= 7)
		{
			ratio[m.cmd] = ((Slider)m.gadget).value;
			if (m.cmd<7)
				((Slider)m.gadget).changeVLabelText( Float.toString(-ratio[m.cmd], "%1.3f:1"));
			else
				((Slider)m.gadget).changeVLabelText( Float.toString(ratio[m.cmd], "%1.3f:1"));
		}
		else
		if( m.cmd == 8)
		{
			end_ratio = ((Slider)m.gadget).value;
			((Slider)m.gadget).changeVLabelText( Float.toString(end_ratio, "%1.3f:1"));
		}
		else
		if( m.cmd == 9 )
		{
			diff_lock = ((Slider)m.gadget).value;
			getCar_LocalVersion();
			if (the_car)
				the_car.updateDifflock();
			((Slider)m.gadget).changeVLabelText( Float.toString(diff_lock*100.0, "%1.0f%%"));
		}
		else
		if( m.cmd == 10 )
		{
			drive_front = -((Slider)m.gadget).value;
			getCar_LocalVersion();
			((Slider)m.gadget).changeVLabelText( Float.toString(drive_front*100.0, "%1.0f") + "/" + Float.toString((1.0-drive_front)*100.0, "%1.0f") + "% F/R" );
		}
	}
	//---------tuning
}
