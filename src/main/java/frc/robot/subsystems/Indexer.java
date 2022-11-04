// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;

public class Indexer extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  TalonSRX indexerMotor;

  public Indexer(int inputID) {
    indexerMotor = new TalonSRX(inputID);
    indexerMotor.setInverted(false);
  }

  /**
   * 
   * @param speed in percentage from -1 to 1
   */
  public void moveMotor(double speed) {
    indexerMotor.set(TalonSRXControlMode.PercentOutput, speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
