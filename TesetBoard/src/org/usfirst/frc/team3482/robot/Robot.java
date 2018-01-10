package org.usfirst.frc.team3482.robot;

import org.usfirst.frc.team3482.robot.subsystems.DartActuator;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

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
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}
	
	@Override
	public void disabledInit(){
	}

	@Override
	public void testPeriodic() {
	}
}
