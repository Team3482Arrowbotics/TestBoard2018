package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MoveActuatorPot extends Command{
	public enum AcValue{
		kRetracted,kHalfway,kExtended;
	}
	AcValue pos;
	public MoveActuatorPot(AcValue pos){
		this.pos = pos;
	}
	public void initialize(){
		if(pos == AcValue.kRetracted){
			Robot.da.setSetpoint(0);
		}
		else if(pos == AcValue.kHalfway){
			Robot.da.setSetpoint(3);
		}
		else if (pos == AcValue.kExtended){
			Robot.da.setSetpoint(3);
		}
	}
	
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
