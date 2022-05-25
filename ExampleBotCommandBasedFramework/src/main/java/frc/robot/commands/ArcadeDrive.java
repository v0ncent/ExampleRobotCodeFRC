// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;

public class ArcadeDrive extends CommandBase {
  DriveTrain l_DriveTrain;
  Joystick joystick;
  /** Creates a new ArcadeDrive. */
  public ArcadeDrive(DriveTrain driveTrain, Joystick js) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveTrain);
    l_DriveTrain = driveTrain;
    joystick = js;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("I Have Run");
    l_DriveTrain.arcadeDrive(0, 0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //define our movespeed and rotatespeed variables with the get raw method of the joystick
    double moveSpeed = -joystick.getRawAxis(Constants.DRIVER_CONTROLLER_MOVE_AXIS);
    double rotateSpeed = joystick.getRawAxis(Constants.DRIVER_CONTROLLER_ROTATE_AXIS);

    //call arcade drive method
    l_DriveTrain.arcadeDrive(moveSpeed, rotateSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
      //at the end of the match we want the robot to stop
      l_DriveTrain.arcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
