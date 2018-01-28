package org.usfirst.frc.team3482.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3482.robot.subsystems.*;

public class LidarDist extends Command{
	//attributes
	LIDAR lidar;
	
	
	public LidarDist(LIDAR lidar)
	{
		this.lidar = lidar;
	}
	
	protected void initialize() {
		//lidar.
	}
	
	protected void execute() {
		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end() {
		
	}
}
