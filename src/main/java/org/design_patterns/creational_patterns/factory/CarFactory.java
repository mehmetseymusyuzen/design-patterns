package org.design_patterns.creational_patterns.factory;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String model, Color color, VehicleType vehicleType) {
        return new Car(model, color, vehicleType);
    }

    @Override
    public Vehicle createVehicle() {
        return new Car("2024", Color.BLUE, VehicleType.CAR);
    }

}
