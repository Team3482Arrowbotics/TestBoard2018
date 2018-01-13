package org.usfirst.frc.team3482.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;

public class RobotMap {
	public static DoubleSolenoid ds;
	public static WPI_TalonSRX talon;
	public static SpeedController sc;
	public static AnalogPotentiometer pot;
	public static void init(){
		ds = new DoubleSolenoid(0,1);
		talon = new WPI_TalonSRX(11);
		pot = new AnalogPotentiometer(0, 6, 0);
	}
}
