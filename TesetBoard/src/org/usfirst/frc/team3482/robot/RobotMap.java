package org.usfirst.frc.team3482.robot;

<<<<<<< HEAD
import org.usfirst.frc.team3482.robot.subsystems.PIDTalonSRX;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SpeedController;

public class RobotMap {
	public static DoubleSolenoid ds;
	public static DoubleSolenoid ds2;
	public static PIDTalonSRX talon;
	public static SpeedController sc;
	public static AnalogPotentiometer pot;
	public static TalonSRX pidtest;
	public static AHRS navx;
	public static void init(){
		//Regulator pressure at 20 kinda(wat) 21
		ds = new DoubleSolenoid(0,1);
		ds2 = new DoubleSolenoid(2,3);
		talon = new PIDTalonSRX(0);
		pidtest = new TalonSRX(10);
		pot = new AnalogPotentiometer(0, 6, 0);
		navx = new AHRS(SPI.Port.kMXP);
=======
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
>>>>>>> branch 'master' of https://github.com/Team3482Arrowbotics/TestBoard2018
	}
}
