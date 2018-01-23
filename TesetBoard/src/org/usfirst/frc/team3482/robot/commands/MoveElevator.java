package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.OI;
import org.usfirst.frc.team3482.robot.RobotMap;
import org.usfirst.frc.team3482.robot.subsystems.Elevator;
import org.usfirst.frc.team3482.robot.subsystems.Elevator.Position;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class MoveElevator extends Command{
	Joystick xb = OI.getXbox();
	public boolean finished = false;
	int posi; //determines to move up or down
	final static double[] positions = new double[]{0, 2.5, 5, 7.5, 10};
	
	public MoveElevator() {
		posi = RobotMap.elevatorPos;
	}
	
	public MoveElevator(Position pos){
		/*if(pos.value() > 4){
			this.pos = 4;
			return;
		}
		if(pos.value() < 0){
			this.pos = 0;
			return;
		}
		this.pos = pos.value();*/
	}
	
	public MoveElevator(int pos){
		posi = pos;
		
		/*System.out.println(pos);
		if(pos > 4){
			pos = 4;
		}
		if(pos < 0){
			pos = 0;
		}
		this.pos = pos;*/
	}
	public void initialize(){
		if(posi == 0) { //go up a level
			RobotMap.elevatorPos ++;
			if(RobotMap.elevatorPos > 4) {
				RobotMap.elevatorPos = 4;
			}
		} else if (posi == 1) { //go down a level
			RobotMap.elevatorPos --;
			if(RobotMap.elevatorPos < 0) {
				RobotMap.elevatorPos = 0;
			}
		}
		
		RobotMap.talon.set(ControlMode.Position, positions[RobotMap.elevatorPos] * 40960);
		
		//Elevator.position = pos;
		//RobotMap.talon.set(ControlMode.Position, positions[pos] * 40960);

		//System.out.println("Closed Loop Error: " + RobotMap.talon.getClosedLoopError(0));

		//System.out.println("Positions[elevatorPos]: " + positions[RobotMap.elevatorPos] * 40960);

		//}
	}
	public void end(){
		System.out.println("Encoder Position: " + RobotMap.talon.getSelectedSensorPosition(0));
		System.out.println("Posi: " + posi);
		System.out.println("ElevatorPos: " + RobotMap.elevatorPos);
		System.out.println("Command over");
		//RobotMap.talon.disable();
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}
}
