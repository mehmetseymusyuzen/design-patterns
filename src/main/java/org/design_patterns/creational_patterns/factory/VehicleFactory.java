package org.design_patterns.creational_patterns.factory;

public interface VehicleFactory {
    Vehicle createVehicle(String model, Color color, VehicleType vehicleType);

    Vehicle createVehicle();

}
