package org.design_patterns.creational_patterns.factory;

public class Truck implements Vehicle {
    private String model;
    private Color color;
    private VehicleType vehicleType;

    public Truck(String model, Color color, VehicleType vehicleType) {
        this.model = model;
        this.color = color;
        this.vehicleType = vehicleType;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", color=" + color +
                ", vehicleType=" + vehicleType +
                '}';
    }

}
