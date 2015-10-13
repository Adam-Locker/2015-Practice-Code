package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.Compressor;

import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 *
 */
public class Pneumatics extends Subsystem {
    
    private static Compressor compressor 	= new Compressor		(RobotMap.PNEUMATICS_COMPRESSOR);
    private static DoubleSolenoid leftArm	= new DoubleSolenoid	(RobotMap.PNEUMATICS_ARM_LEFT_FWD,RobotMap.PNEUMATICS_ARM_LEFT_BWD);	
    private static DoubleSolenoid rightArm	= new DoubleSolenoid	(RobotMap.PNEUMATICS_ARM_RIGHT_FWD,RobotMap.PNEUMATICS_ARM_RIGHT_BWD);
    
    
    public void initDefaultCommand() {
    }
    
    public void compressorStart(){
    	compressor.start();
    }
    
    public void compressorStop(){
    	compressor.stop();
    }
    
    public void leftArmOpen(){
    	leftArm.set(DoubleSolenoid.Value.kForward);
    }
    
    public void leftArmClose(){
    	leftArm.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void rightArmOpen(){
    	rightArm.set(DoubleSolenoid.Value.kForward);
    }
    
    public void rightArmClose(){
    	rightArm.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void bothArmsNeutral(){
    	rightArm.set(DoubleSolenoid.Value.kOff);
    	leftArm.set(DoubleSolenoid.Value.kOff);
    }
    
}

