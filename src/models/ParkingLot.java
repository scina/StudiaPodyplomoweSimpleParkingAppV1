package models;

import models.samples.AuthorizedVehicles;
import models.samples.VehiclesOnParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Vehicle> vehiclesOnParkingLot;
    private List<IdentificationNumber> authorizedVehicles;

    public ParkingLot() {
        this.authorizedVehicles = new ArrayList<>();
        this.vehiclesOnParkingLot = new ArrayList<>();

        authorizedVehicles.addAll(new AuthorizedVehicles().getAuthorizedVehicles());
        vehiclesOnParkingLot.addAll(new VehiclesOnParkingLot().getVehiclesOnParkingLot());
    }

    public boolean addNewAuthorizedVehicle(Vehicle vehicle) {
        authorizedVehicles.add(vehicle);
        return true;
    }

    public boolean addVehicleOnParkingLot(Vehicle vehicle) throws VehicleOnParkingException {
        for (Vehicle v : vehiclesOnParkingLot) {
            if (vehicle.identificationNumber().equals(v.identificationNumber())) {
                throw new VehicleOnParkingException("Your car is already on parking lot, contact with service");
            }
        }
        vehiclesOnParkingLot.add(vehicle);
        return true;
    }

    public boolean removeVehicleFromParkingLot(Vehicle vehicle) {
        return vehiclesOnParkingLot.remove(vehicle);
    }

    public List<Vehicle> getVehiclesOnParkingLot() {
        return vehiclesOnParkingLot;
    }

    public List<IdentificationNumber> getAuthorizedVehicles() {
        return authorizedVehicles;
    }

    public boolean isVehicleOnAuthorizedList(Vehicle vehicle) {
        for(IdentificationNumber idNum : authorizedVehicles) {
            if (vehicle.identificationNumber().equals(idNum.identificationNumber())) {
                return true;
            }
        }
        return false;
    }
}
