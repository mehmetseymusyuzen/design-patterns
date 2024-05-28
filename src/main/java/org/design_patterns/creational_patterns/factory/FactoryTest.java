package org.design_patterns.creational_patterns.factory;

public class FactoryTest {
    public static void main(String[] args) {

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle("2024", Color.BLACK, VehicleType.CAR);
        System.out.println(car);

        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle("2025", Color.WHITE, VehicleType.TRUCK);
        System.out.println(truck);

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        System.out.println(bike);

    }
}
