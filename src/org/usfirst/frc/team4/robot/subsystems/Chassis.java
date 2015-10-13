package org.usfirst.frc.team4.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.Drive_Manual;

import edu.wpi.first.wpilibj.VictorSP;

public class Chassis extends Subsystem {

	private VictorSP LeftFwd = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFTFRONT);
	private VictorSP LeftRwd = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFTREAR);
	private VictorSP RightFwd = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHTFRONT);
	private VictorSP RightRwd = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHTREAR);

	public void initDefaultCommand() {
		setDefaultCommand(new Drive_Manual());
	}

	public void tank(double left, double right) {
		left = pwmLimit(left);
		right = pwmLimit(right);

		TankPassthrough(left, right);
	}

	public void stop() {
		TankPassthrough(0, 0);
	}

	public double pwmLimit(double number) {
		if (number > 1) {
			number = 1;
		} else if (number < -1) {
			number = -1;
		}
		return number;
	}

	private void TankPassthrough(double left, double right) {
		LeftFwd.set(left);
		LeftRwd.set(left);

		RightFwd.set(-right);
		RightRwd.set(-right);
	}
}