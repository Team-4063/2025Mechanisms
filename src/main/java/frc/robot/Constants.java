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
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class ElevatorConstants {
    public static final double Rest = 0.0;
    public static final double CoralIntake = 12.0;
    public static final double CoralL1 = 10.0;
    public static final double CoralL2 = 15.0;
    public static final double CoralL3 = 20.0;
    public static final double CoralL4 = 25.0;
    public static final double AlgaeLow = 15.0;
    public static final double AlgaeHigh = 20.0;

    public static final double GearRatio = 10.7;

    public static final double CruiseVelocity = 5; //5 rotations per second cruise
    public static final double Acceleration = 10; //Take approx 0.5 seconds to reach max vel
    public static final double Jerk = 100; //Take approximately 0.1 seconds to reach max accel

    public static final double kP = 5;  // An error of 1 rotation results in kP V output
    public static final double kI = 0; //No output for integrated error
    public static final double kD = 0.1; //A velocity of 1 rps results in kD V output
    public static final double kV = 0.12; //A velocity target of 1 rps results in kV V output
    public static final double kS = 0.25; //Approximately kS V to get the mechanism moving, output to overcome static friction

    public static final boolean StatorEnable = true;
    public static final double StatorLimit = 60;

    public static final boolean SupplyEnable = true;
    public static final double SupplyLimit = 60;

    public static final double desiredRotations = 10;
  }

  public static class MotorConstants {
    public static final String CANbus = "canivore";
    
    //ELEVATOR
    public static final int kElevatorPort1 = 21;
    public static final int kElevatorPort2 = 22;
  }

}
