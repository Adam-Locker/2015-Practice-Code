package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Drive_Manual extends Command {

	public Drive_Manual() {
		requires(Robot.chassis);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.chassis.tank(0, 0);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.chassis.stop();
	}

	protected void interrupted() {
		end();
	}
}
