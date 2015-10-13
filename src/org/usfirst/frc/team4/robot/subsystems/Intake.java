package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.compressorStart;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
    
private static VictorSP leftIntake	= new VictorSP(RobotMap.INTAKE_LEFT);
private static VictorSP rightIntake	= new VictorSP(RobotMap.INTAKE_RIGHT);



    public void initDefaultCommand() {
    	setDefaultCommand(new compressorStart());
    }
    
    public void speed(double l, double r){
    	leftIntake.set(l);
    	rightIntake.set(-r);
    }
    
    public void intake(){
    	speed(1,1);
    }
    
    public void rotateCounterclockwise(){
    	speed(1,-1);
    }
    
    public void rotateClockwise(){
    	speed(-1,1);
    }
    
    public void reject(){
    	speed(-1,-1);
    }
    
    public void stop(){
    	speed(0,0);
    }
}

