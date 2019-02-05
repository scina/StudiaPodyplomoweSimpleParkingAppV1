package models.samples;

import models.Car;
import models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehiclesOnParkingLot {
    private List<Vehicle> vehiclesOnParkingLot;

    public VehiclesOnParkingLot() {
        vehiclesOnParkingLot = new ArrayList<>();
        vehiclesOnParkingLot.add(new Car("DW 88999"));
        vehiclesOnParkingLot.add(new Car("DW 88998"));
        vehiclesOnParkingLot.add(new Car("DW 88997"));
    }

    public List<Vehicle> getVehiclesOnParkingLot() {
        return vehiclesOnParkingLot;
    }
}
