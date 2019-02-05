package models;

public abstract class Vehicle implements IdentificationNumber {
    private String vehicleIdentificationNumber;

    Vehicle(String vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public String identificationNumber() {
        return this.vehicleIdentificationNumber;
    }
}
