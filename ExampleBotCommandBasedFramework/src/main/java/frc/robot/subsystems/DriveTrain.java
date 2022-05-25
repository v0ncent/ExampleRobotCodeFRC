// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
    //define global victor values but do not set them to anything
     //we do this because we eventualy want to set different object values to them
     WPI_VictorSPX leftFrontVictor;
     WPI_VictorSPX leftBackVictor;
     WPI_VictorSPX rightFrontVictor;
     WPI_VictorSPX rightBackVictor;
 
     //create differential drive
     DifferentialDrive differentialDrive;
     //create motor controller group for left and right talons
     MotorControllerGroup leftVictors;
     MotorControllerGroup rightVictors;
 
     //create constructor for drivetrain that sets needed victor motors
     public DriveTrain(){
         //set talons to our constants
         leftFrontVictor = new WPI_VictorSPX(Constants.DRIVETRAIN_LEFT_FRONT_VICTOR);
         leftBackVictor = new WPI_VictorSPX(Constants.DRIVETRAIN_LEFT_BACK_VICTOR);
         rightFrontVictor = new WPI_VictorSPX(Constants.DRIVETRAIN_RIGHT_FRONT_VICTOR);
         rightBackVictor = new WPI_VictorSPX(Constants.DRIVETRAIN_RIGHT_BACK_VICTOR);
         leftVictors = new MotorControllerGroup(rightFrontVictor, rightBackVictor);
         leftVictors.setInverted(true); //note this inverted to allow for motors to turn the same direction
         leftVictors = new MotorControllerGroup(leftFrontVictor, leftBackVictor);
         differentialDrive = new DifferentialDrive(leftVictors,rightVictors);
     }
         //create arcadeDrive method
    /*
    note: void means we arent returning anything, and we are taking 
    in two double parameters moveSped and rotateSpeed.
    */
    public void arcadeDrive(double moveSpeed, double rotateSpeed){
        // now here we will call the differential drives arcadeDrive methodx`
        differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);

        /*
        now if we wanted this to manipulate this to not be 1 to 1 we would manipulate
        moveSpeed and rotateSpeed, we would want to do this to allow for smoothing of
        driving 
        */
    }
    
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
