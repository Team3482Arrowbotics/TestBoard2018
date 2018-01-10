package org.usfirst.frc.team3482.robot;

import org.usfirst.frc.team3482.robot.commands.MoveActuatorPot;
import org.usfirst.frc.team3482.robot.commands.MoveActuatorPot.AcValue;
import org.usfirst.frc.team3482.robot.commands.SlowSpin;
import org.usfirst.frc.team3482.robot.commands.SwitchPiston;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	Joystick x;
	JoystickButton switchPiston;
	JoystickButton extendActuator;
	JoystickButton halfActuator;
	JoystickButton retractActuator;
	public OI(){
		x = new Joystick(0);
		switchPiston = new JoystickButton(x, 1);
		switchPiston.whenPressed(new SwitchPiston());
		extendActuator = new JoystickButton(x, 2);
		extendActuator.whenPressed(new MoveActuatorPot(AcValue.kExtended));
		halfActuator = new JoystickButton(x, 3);
		halfActuator.whenPressed(new MoveActuatorPot(AcValue.kHalfway));
		retractActuator = new JoystickButton(x, 4);
		retractActuator.whenPressed(new MoveActuatorPot(AcValue.kRetracted));
	}
}