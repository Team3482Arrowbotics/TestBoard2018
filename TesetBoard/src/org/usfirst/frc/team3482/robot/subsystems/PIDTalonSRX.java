package org.usfirst.frc.team3482.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.PIDOutput;

public class PIDTalonSRX extends TalonSRX implements PIDOutput{

	public PIDTalonSRX(int deviceNumber) {
		super(deviceNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pidWrite(double output) {
		this.set(ControlMode.PercentOutput, output);
		
	}

}
