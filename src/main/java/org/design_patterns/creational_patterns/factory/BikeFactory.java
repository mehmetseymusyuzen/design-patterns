package org.design_patterns.creational_patterns.factory;

public class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String model, Color color, VehicleType vehicleType) {
        return new Bike(model, color, vehicleType);
    }

    @Override
    public Vehicle createVehicle() {
        return new Bike("2023", Color.BLUE, VehicleType.BIKE);
    }

}
