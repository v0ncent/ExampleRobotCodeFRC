package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
public class DriveTrain extends SubsystemBase {
    //define global talon values but do not set them to anything
     //we do this because we eventually want to set different object values to them
    Talon leftFrontTalon = null;
    Talon rightFrontTalon = null;
    Talon leftBackTalon = null;
    Talon rightBackTalon = null;
    //create constructor for drivetrain that sets needed talon motors
    public DriveTrain(){
        leftFrontTalon = new Talon(Constants.DRIVETRAIN_LEFT_FRONT_TALON);
        rightFrontTalon = new Talon(Constants.DRIVETRAIN_RIGHT_FRONT_TALON);
        leftBackTalon = new Talon(Constants.DRIVETRAIN_LEFT_BACK_TALON);
        rightBackTalon = new Talon(Constants.DRIVETRAIN_RIGHT_BACK_TALON);
    }

    
    
}
