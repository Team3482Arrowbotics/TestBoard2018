package org.usfirst.frc.team3482.robot;

import org.usfirst.frc.team3482.robot.subsystems.PIDTalonSRX;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;

public class RobotMap {
	public static DoubleSolenoid ds;
	public static PIDTalonSRX talon;
	public static SpeedController sc;
	public static AnalogPotentiometer pot;
	public static void init(){
		ds = new DoubleSolenoid(0,1);
		talon = new PIDTalonSRX(0);
		pot = new AnalogPotentiometer(0, 6, 0);
	}
}
