package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class SwitchPiston extends InstantCommand{
	public void initialize(){
		if(RobotMap.ds.get() == DoubleSolenoid.Value.kForward){
			RobotMap.ds.set(DoubleSolenoid.Value.kReverse);
		} else{
			RobotMap.ds.set(DoubleSolenoid.Value.kForward);
		}
		
		if(RobotMap.ds2.get() == DoubleSolenoid.Value.kForward){
			RobotMap.ds2.set(DoubleSolenoid.Value.kReverse);
		} else{
			RobotMap.ds2.set(DoubleSolenoid.Value.kForward);
		}
	}
}
