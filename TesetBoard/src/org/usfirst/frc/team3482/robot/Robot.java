package org.usfirst.frc.team3482.robot;

import org.usfirst.frc.team3482.robot.subsystems.Elevator;
import org.usfirst.frc.team3482.robot.subsystems.LIDAR;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	public Elevator e;
	public LIDAR lidar;
	public OI oi;
	private double driveOutput=1;
	private double speedControl=1;
	private double speed;
	@Override
	public void robotInit() {
		RobotMap.init();
		/*WPI_TalonSRX _talon = RobotMap.talon;
        _talon.setSelectedSensorPosition(absolutePosition, Constants.kPIDLoopIdx, Constants.kTimeoutMs);
        
        _talon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, Constants.kPIDLoopIdx, Constants.kTimeoutMs);
        _talon.setSensorPhase(true);
        _talon.configNominalOutputForward(0, Constants.kTimeoutMs);
        _talon.configNominalOutputReverse(0, Constants.kTimeoutMs);
        _talon.configPeakOutputForward(1, Constants.kTimeoutMs);
        _talon.configPeakOutputReverse(-1, Constants.kTimeoutMs);
        
        _talon.configAllowableClosedloopError(0, Constants.kPIDLoopIdx, Constants.kTimeoutMs);
        _talon.config_kF(Constants.kPIDLoopIdx, 0.0, Constants.kTimeoutMs);
        _talon.config_kP(Constants.kPIDLoopIdx, 0.1, Constants.kTimeoutMs);
        _talon.config_kI(Constants.kPIDLoopIdx, 0.0, Constants.kTimeoutMs);
        _talon.config_kD(Constants.kPIDLoopIdx, 0.0, Constants.kTimeoutMs);*/
		OI oi = new OI();
		e = new Elevator();
		lidar = new LIDAR(I2C.Port.kOnboard);
		lidar.start(500);
		
		//RobotMap.talon.set(ControlMode.Position, 0);
	}
	@Override
	public void teleopInit(){
		//lidar.update();
		System.out.println(lidar.getAddress());

		
		
		//RobotMap.pidtest.set(ControlMode.PercentOutput, -0.5);
		//RobotMap.pidtest.set(ControlMode.Position, 1000);
		//RobotMap.pidtest.getSensorCollection().setQuadraturePosition(0, 2);
		//RobotMap.pidtest.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 1);
	}

	@Override
	public void teleopPeriodic() {
		/*
		
		//RobotMap.talon.set(ControlMode.Position, 409600);
		//System.out.println(OI.getXbox().getPOV());
		//SmartDashboard.putNumber("Talon Encoder Position", RobotMap.talon.getSelectedSensorPosition(0));
		//System.out.println("Encoder Position: " + RobotMap.talon.getSelectedSensorPosition(0) + "Closed Loop Error: " + RobotMap.talon.getClosedLoopError(0));
		Scheduler.getInstance().run();
		lidar.update();
		System.out.println("LIDAR Distance: " + LIDAR.getDistance());
		//SmartDashboard.put
		//Elevator.moveElevator();
		//System.out.println(RobotMap.pidtest.getSensorCollection().getQuadraturePosition());
		//System.out.println(RobotMap.pidtest.getSelectedSensorPosition(1333739));[\]
		
		*/
		speed = oi.x.getRawAxis(1);
		RobotMap.talon.set(speed);
		
		System.out.println("Drive Motor Encoder Speed "+RobotMap.talon.getSelectedSensorVelocity(0));
		driveOutput = RobotMap.talon.getMotorOutputPercent();
		System.out.println("Drive Motor Percent Output "+driveOutput);
		speedControl=RobotMap.speedPID.getOutput();
		System.out.println("Speed PID Output "+speedControl);
		
	}
	
	@Override
	public void disabledInit(){
	}

	@Override
	public void testPeriodic() {
		SmartDashboard.putData(lidar);
		SmartDashboard.putNumber("LIDAR Distance: ", lidar.getDistance());
	}
}
