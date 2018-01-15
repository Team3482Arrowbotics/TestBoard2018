package org.usfirst.frc.team3482.robot;

import org.usfirst.frc.team3482.robot.subsystems.DartActuator;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	public static DartActuator da;
	@Override
	public void robotInit() {
		RobotMap.init();
		OI oi = new OI();
		da = new DartActuator(.1, 0, 0);
	}
	@Override
	public void teleopInit(){
		//RobotMap.pidtest.set(ControlMode.PercentOutput, -0.5);
		//RobotMap.pidtest.set(ControlMode.Position, 1000);
		//RobotMap.pidtest.getSensorCollection().setQuadraturePosition(0, 2);
		//RobotMap.pidtest.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 1);
	}

	@Override
	public void teleopPeriodic() {
		SmartDashboard.putNumber("Potentiometer Value", RobotMap.pot.get());
		Scheduler.getInstance().run();
		//System.out.println(RobotMap.pidtest.getSensorCollection().getQuadraturePosition());
		//System.out.println(RobotMap.pidtest.getSelectedSensorPosition(1333739));
	}
	
	@Override
	public void disabledInit(){
	}

	@Override
	public void testPeriodic() {
	}
}
