package org.design_patterns.creational_patterns.factory;

public class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String model, Color color, VehicleType vehicleType) {
        return new Truck(model, color, vehicleType);
    }

    @Override
    public Vehicle createVehicle() {
        return new Truck("2025", Color.BLACK, VehicleType.TRUCK);
    }

}
