package org.usfirst.frc.team4.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4.robot.Robot;
/**
 *
 */
public class rightArmOpen extends Command {

    public rightArmOpen() {
    	requires(Robot.pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.pneumatics.rightArmOpen();
    }

    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
