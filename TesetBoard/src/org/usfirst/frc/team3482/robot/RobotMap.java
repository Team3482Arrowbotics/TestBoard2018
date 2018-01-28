package org.usfirst.frc.team3482.robot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;

public class RobotMap {
	//public static DoubleSolenoid ds;
	public static WPI_TalonSRX talon;
	public static SpeedController sc;
	public static AnalogPotentiometer pot;
	public static AnalogInput rangeFinder;
	//public static DoubleSolenoid ds2;
	public static int elevatorPos;
	public static WPI_TalonSRX intakeMotorLeft;
	public static WPI_TalonSRX intakeMotorRight;
	//public static DoubleSolenoid ds3;
	//public static DoubleSolenoid ds4;
	public static WPI_TalonSRX talon2;
	public static WPI_TalonSRX talonSpin;
	public static void init(){
		
		/*
		ds = new DoubleSolenoid(1,0); //right arm
		ds2 = new DoubleSolenoid(2,3);//right ramp
		ds3 = new DoubleSolenoid(5,4); //left ramp
		ds4 = new DoubleSolenoid(6,7); //left arm
		*/
		
		intakeMotorLeft = new WPI_TalonSRX(4);
		intakeMotorRight = new WPI_TalonSRX(7);
		talon = new WPI_TalonSRX(0);
		talonSpin = new WPI_TalonSRX(1);
		talon2 = new WPI_TalonSRX(8);
		pot = new AnalogPotentiometer(0, 6, 0);
		rangeFinder = new AnalogInput(1);
		
		elevatorPos = 0;
	/*	
		
		talon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		talon.setSensorPhase(true);
		talon.config_kP(0, 1, 0);
		*/
	}
}
