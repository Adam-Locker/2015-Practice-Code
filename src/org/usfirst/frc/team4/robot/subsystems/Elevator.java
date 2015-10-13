package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.VictorSP;

public class Elevator extends Subsystem {
    
private static VictorSP Elevator = new VictorSP(RobotMap.Elevator_Motor);

    public void initDefaultCommand() {
    }
    
    public void EleUp(){
    	manual(1);
    }
    
    public void EleDown(){
    	manual(-1);
    }
    		
    public void manual (double speed){
    	Elevator.set(speed);
    }
    
    public void stop(){
    	Elevator.set(0);
    }
}

