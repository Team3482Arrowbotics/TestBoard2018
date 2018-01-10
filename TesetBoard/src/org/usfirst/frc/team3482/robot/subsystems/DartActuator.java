package org.usfirst.frc.team3482.robot.subsystems;

import org.usfirst.frc.team3482.robot.RobotMap;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

public class DartActuator extends PIDSubsystem{

	public DartActuator(double p, double i, double d) {
		super(p, i, d);
		this.setInputRange(0, 6);
		this.enable();
		this.setAbsoluteTolerance(.01);
		this.setOutputRange(-1, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return RobotMap.pot.get();
	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		RobotMap.talon.pidWrite(output);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
