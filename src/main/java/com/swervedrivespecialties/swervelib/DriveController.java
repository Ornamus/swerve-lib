package com.swervedrivespecialties.swervelib;

import edu.wpi.first.wpilibj.simulation.SimDeviceSim;

public interface DriveController {
    void setReferenceVoltage(double voltage);

    double getStateVelocity();

    double getPosition();

    void setPosition(double position);

    SimDeviceSim getSimulatedMotor();
}
