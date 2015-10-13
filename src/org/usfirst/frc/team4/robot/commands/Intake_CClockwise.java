package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Intake_CClockwise extends Command {

	public Intake_CClockwise() {
		requires(Robot.intake);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.intake.rotateCounterclockwise();
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.intake.stop();
	}

	protected void interrupted() {
		end();
	}
}
