package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class SlowSpin extends Command{
	double speed;
	public SlowSpin(double speed){
		this.speed = speed;
	}
	public void initialize(){
		//RobotMap.pidtest.set(ControlMode.PercentOutput, speed);
	}
	public void end(){
		//RobotMap.pidtest.set(ControlMode.PercentOutput, 0);
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
