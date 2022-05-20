// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
    //define global talon values but do not set them to anything
     //we do this because we eventualy want to set different object values to them
     Talon leftFrontTalon;
     Talon leftBackTalon;
     Talon rightFrontTalon;
     Talon rightBackTalon;
 
     //create differential drive
     DifferentialDrive differentialDrive;
     //create motor controller group for left and right talons
     MotorControllerGroup leftTalons;
     MotorControllerGroup rightTalons;
 
     //create constructor for drivetrain that sets needed talon motors
     public DriveTrain(){
         //set talons to our constants
         leftFrontTalon = new Talon(Constants.DRIVETRAIN_LEFT_FRONT_TALON);
         leftBackTalon = new Talon(Constants.DRIVETRAIN_LEFT_BACK_TALON);
         rightFrontTalon = new Talon(Constants.DRIVETRAIN_RIGHT_FRONT_TALON);
         rightBackTalon = new Talon(Constants.DRIVETRAIN_RIGHT_BACK_TALON);
 
         //initialize motor control groups and differential drive
         leftTalons = new MotorControllerGroup(leftFrontTalon, leftBackTalon);
         rightTalons = new MotorControllerGroup(rightFrontTalon, rightBackTalon);
         differentialDrive = new DifferentialDrive(leftTalons,rightTalons);
     }
         //create arcadeDrive method
    /*
    note: void means we arent returning anything, and we are taking 
    in two double parameters moveSped and rotateSpeed.
    */
    public void arcadeDrive(double moveSpeed, double rotateSpeed){
        // now here we will call the differential drives arcadeDrive methodx`
        differentialDrive.arcadeDrive(moveSpeed, rotateSpeed); 
    }
    
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
