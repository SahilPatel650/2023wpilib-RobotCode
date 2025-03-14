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
public final class Constants {
    /**
    * The left-to-right distance between the drivetrain wheels
    *
    * Should be measured from center to center.
    */
    public static final double DRIVETRAIN_TRACKWIDTH_METERS = 0.508; //Measure and set trackwidth
    /**
    * The front-to-back distance between the drivetrain wheels.
    *
    * Should be measured from center to center.
    */
    
    public static final double kP = 0.03;
    public static final double kI = 0.0;
    public static final double kD = 0.01;
    
    public static final double DRIVETRAIN_WHEELBASE_METERS = 0.6604; //Measure and set wheelbase
    
    public static final int DRIVETRAIN_PIGEON_ID = 0; //Set Pigeon ID
    
    public static final int FRONT_LEFT_MODULE_DRIVE_MOTOR = 6; //Set front left module drive motor ID
    public static final int FRONT_LEFT_MODULE_STEER_MOTOR = 8; //Set front left module steer motor ID
    public static final int FRONT_LEFT_MODULE_STEER_ENCODER= 11; //Set front left steer encoder ID
    // public static final double FRONT_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(113.4); //Measure and set front left steer offset
    public static final double FRONT_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(110.2); //Measure and set front left steer offset
    
    public static final int FRONT_RIGHT_MODULE_DRIVE_MOTOR = 4; //Set front right drive motor ID
    public static final int FRONT_RIGHT_MODULE_STEER_MOTOR = 9; //Set front right steer motor ID
    public static final int FRONT_RIGHT_MODULE_STEER_ENCODER = 12; //Set front right steer encoder ID
    //public static final double FRONT_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(68.8); //Measure and set front right steer offset
    public static final double FRONT_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(62.7); //Measure and set front right steer offset
    
    public static final int BACK_LEFT_MODULE_DRIVE_MOTOR = 2; //Set back left drive motor ID
    public static final int BACK_LEFT_MODULE_STEER_MOTOR = 7; //Set back left steer motor ID
    public static final int BACK_LEFT_MODULE_STEER_ENCODER = 10; //Set back left steer encoder ID
    // public static final double BACK_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(229.6); //Measure and set back left steer offset
    public static final double BACK_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(47.5); //Measure and set back left steer offset
    
    
    public static final int BACK_RIGHT_MODULE_DRIVE_MOTOR = 5; //Set back right drive motor ID
    public static final int BACK_RIGHT_MODULE_STEER_MOTOR = 3; //Set back right steer motor ID
    public static final int BACK_RIGHT_MODULE_STEER_ENCODER = 13; //Set back right steer encoder ID
    // public static final double BACK_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(207.4); //Measure and set back right steer offset
    public static final double BACK_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(205.8); //Measure and set back right steer offset
    
    public static final int ARM_MOTOR_ID = 15; //sahil- random unused value, maybe should be different?
    public static final int CLAW_MOTOR_ID = 14; //sahil- random unused value, maybe should be different?
    public static final double armEncoderMax = 0;
    

    // This is the value with which we stop moving
    public static final double MINIMUM_DISPLACEMENT = 0.01;
    public static final double SPEED_SCALE_FACTOR = 0.01;
    public static final double minYSpeed = 0.000001;
    public static final double minXSpeed = -0.000001;

    // Prabhu - Max voltage changed from 12 to 2
    public static double MAX_Voltage=2;
}
