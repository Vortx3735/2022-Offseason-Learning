// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class IndexerExample extends SubsystemBase {
  TalonSRX indexer;
  /** Creates a new ExampleSubsystem. */
  public IndexerExample(int port) {
    indexer = new TalonSRX(port);
    indexer.setInverted(true);
  }

  // speed from -1 to 1
  public void turnOnMotor(double speed) {
    indexer.set(TalonSRXControlMode.PercentOutput, speed);
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
