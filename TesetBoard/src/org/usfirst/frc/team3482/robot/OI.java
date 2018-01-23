package org.usfirst.frc.team3482.robot;

import org.usfirst.frc.team3482.robot.DPadButton.Direction;
import org.usfirst.frc.team3482.robot.commands.MoveElevator;
import org.usfirst.frc.team3482.robot.commands.SlowSpin;
import org.usfirst.frc.team3482.robot.commands.SwitchPiston;
import org.usfirst.frc.team3482.robot.subsystems.Elevator;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public static Joystick x;
	JoystickButton switchPiston;
	JoystickButton extendActuator;
	JoystickButton halfActuator;
	JoystickButton retractActuator;
	JoystickButton slowSpin;
	DPadButton elevatorUp;
	DPadButton elevatorDown;
	public OI(){
		x = new Joystick(0);
		switchPiston = new JoystickButton(x, 1);
		switchPiston.whenPressed(new SwitchPiston());
		//extendActuator = new JoystickButton(x, 2);
		//extendActuator.whenPressed(new MoveActuatorPot(AcValue.kExtended));
		//Below is actually to spin talon motor
		slowSpin = new JoystickButton(x, 2);
		slowSpin.whenPressed(new SlowSpin(.3));
		
		elevatorUp = new DPadButton(x, Direction.NORTH);
		elevatorUp.whenPressed(new MoveElevator(0));
		elevatorDown = new DPadButton(x, Direction.SOUTH);
		elevatorDown.whenPressed(new MoveElevator(1));
	}
	
	public static Joystick getXbox() {
		return x;
	}
}
