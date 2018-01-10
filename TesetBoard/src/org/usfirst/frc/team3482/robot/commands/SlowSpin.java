package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class SlowSpin extends Command{
	public void initialize(){
		RobotMap.talon.set(ControlMode.PercentOutput, .1);
	}
	public void end(){
		RobotMap.talon.set(ControlMode.PercentOutput, 0);
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
