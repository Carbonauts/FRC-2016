package org.usfirst.frc.team1829.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {
 
	private CANTalon frontRight;
	private CANTalon frontLeft;
	private CANTalon rearRight;
	private CANTalon rearLeft;

	private Talon leftTilt;
	private Talon rightTilt;
	private DigitalInput leftTractionSwitch;
	private DigitalInput leftMecanumSwitch;
	private DigitalInput rightTractionSwitch;
	private DigitalInput rightMecanumSwitch;
	private RobotDrive robotDrive;
	
	public Drive() {
		frontRight = new CANTalon(0); 
		frontLeft = new CANTalon(1); 
		rearRight = new CANTalon(2);
		rearLeft = new CANTalon(3); 
		
		robotDrive = new RobotDrive(frontLeft, rearLeft, frontRight, rearRight);
		
		leftTilt = new Talon(0);
		rightTilt = new Talon(1);
		leftMecanumSwitch = new DigitalInput(0);
		leftTractionSwitch = new DigitalInput(1);
		rightMecanumSwitch = new DigitalInput(2);
		rightTractionSwitch = new DigitalInput(3);
	}
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
