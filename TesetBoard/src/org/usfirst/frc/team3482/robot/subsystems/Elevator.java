package org.usfirst.frc.team3482.robot.subsystems;

import java.sql.Time;

import org.usfirst.frc.team3482.robot.OI;
import org.usfirst.frc.team3482.robot.RobotMap;
import org.usfirst.frc.team3482.robot.commands.MoveElevator;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem{
	final static double[] positions = new double[]{0, 2.5, 5, 7.5, 10};
	public enum Position{
		LOWEST (0), LOWER (1), MIDDLE (2), HIGHER (3), HIGHEST (4);
		private final int p;
		private Position(int p){
			this.p = p;
		}
		public int value(){
			return p;
		}
	}
	
	public static void moveElevator() {
		/*if(OI.getXbox().getPOV() == 0) {
			RobotMap.elevatorPos ++;
			if(RobotMap.elevatorPos > 4) {
				RobotMap.elevatorPos = 4;
			}
			RobotMap.talon.set(ControlMode.Position, positions[RobotMap.elevatorPos] * 40960);		
		} else if (OI.getXbox().getPOV() == 180) {
			RobotMap.elevatorPos --;
			if(RobotMap.elevatorPos < 0) {
				RobotMap.elevatorPos = 0;
			}
			RobotMap.talon.set(ControlMode.Position, positions[RobotMap.elevatorPos] * 40960);
		} else {
			RobotMap.talon.disable();
		}*/
	}
	public static int position;
	@Override
	protected void initDefaultCommand() {
		new MoveElevator(0).start();		
	}
	

}
