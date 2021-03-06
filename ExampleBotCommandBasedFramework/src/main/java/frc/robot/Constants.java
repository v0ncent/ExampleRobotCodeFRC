// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */

 /*Basically what goes in here are variables that will never ever change, there will probably be alot of these 
 so that is why there is a new class for this

 we do this because it makes it super easy to track down this multi use variables and creates a nice spot for 
 them to be easily accessed and changed.
*/
 public final class Constants {
    //example variable
    public static final int numberNeeded = 19; //this is now globally accesible throught the project
    //define victor ports for drivetrain
    public static final int DRIVETRAIN_LEFT_FRONT_VICTOR = 3;
    public static final int DRIVETRAIN_LEFT_BACK_VICTOR = 4;
    public static final int DRIVETRAIN_RIGHT_FRONT_VICTOR = 1;
    public static final int DRIVETRAIN_RIGHT_BACK_VICTOR = 2;
    //define our driver controller
    public static final int DRIVER_CONTROLLER = 0;
    //define our driver variables
    public static final int DRIVER_CONTROLLER_MOVE_AXIS = 1;
    public static final int DRIVER_CONTROLLER_ROTATE_AXIS = 2;
}
