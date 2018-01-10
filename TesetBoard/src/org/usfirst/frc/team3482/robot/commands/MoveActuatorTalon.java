package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class MoveActuatorTalon extends InstantCommand {
	double pos;
	public MoveActuatorTalon(double pos){
		this.pos = pos;
	}
	public void initialize(){
		RobotMap.talon.set(ControlMode.Position, pos);
	}
}
