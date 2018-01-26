package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class SwitchPiston extends InstantCommand{
	public void initialize(){
		if(RobotMap.ds.get() == DoubleSolenoid.Value.kForward){
			RobotMap.ds.set(DoubleSolenoid.Value.kReverse);
			System.out.println("Piston Reversed!");
		} else{
			RobotMap.ds.set(DoubleSolenoid.Value.kForward);
			System.out.println("Piston Forward!");
		}
		
		if(RobotMap.ds2.get() == DoubleSolenoid.Value.kForward){
			RobotMap.ds2.set(DoubleSolenoid.Value.kReverse);
			System.out.println("Piston 2 Reversed!");
		} else{
			RobotMap.ds2.set(DoubleSolenoid.Value.kForward);
			System.out.println("Piston 2 Forward!");
		}
		
		if(RobotMap.ds3.get() == DoubleSolenoid.Value.kForward){
			RobotMap.ds3.set(DoubleSolenoid.Value.kReverse);
			System.out.println("Piston 3 Reversed!");
		} else{
			RobotMap.ds3.set(DoubleSolenoid.Value.kForward);
			System.out.println("Piston 3 Forward!");
		}

		if(RobotMap.ds4.get() == DoubleSolenoid.Value.kForward){
			RobotMap.ds4.set(DoubleSolenoid.Value.kReverse);
			System.out.println("Piston 4 Reversed!");
		} else{
			RobotMap.ds4.set(DoubleSolenoid.Value.kForward);
			System.out.println("Piston 4 Forward!");
		}
	}
	public boolean isFinished(){
		return false;
	}
}
