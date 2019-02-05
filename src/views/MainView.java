package views;

import models.IdentificationNumber;
import models.Vehicle;

import java.util.List;

public class MainView {
    public void welcomeMessage() {
        System.out.println("Welcome in Parking App");
    }

    public void appInfo() {
        System.out.print("APP INFO: ");
        System.out.println("To use app, you need to have car with identification number");
    }

    public void vehicleNumberQuestion() {
        System.out.print("Write your vehicle number (XXX XXXXX): ");
    }

    public void vehicleNumberScanningMessage(String vehicleNumber) {
        System.out.println("Your Vehicle number: " + vehicleNumber);
    }

    public void authorizeInfo() {
        System.out.print("AUTH. INFO: ");
        System.out.println("To enter to the parking, your vehicle must by on authorized list");
    }

    public void vehicleIsAuthorized(String vehicleNumber) {
        System.out.println("Your vehicle: " + vehicleNumber + ", is on authorized list");
        System.out.println("You can enter to the parking lot");
    }

    public void vehicleIsNotRegisterMessage(String vehicleNumber) {
        System.out.println("Your vehicle: " + vehicleNumber + ", is not on authorized list");
        System.out.println("You can't enter to the parking lot");
    }

    public void registerQuestion() {
        System.out.println("Do you want register your vehicle?");
    }

    public void registerVehicleMessage(String vehicleNumber) {
        System.out.println("Your vehicle: " + vehicleNumber + ", is add on authorized list");
    }

    public void enterParkingQuestion() {
        System.out.println("Do you want enter to the parking lot?");
    }

    public void yesOrNoOptions() {
        System.out.println("1. YES");
        System.out.println("2. NO");
        System.out.print("Pick option: ");
    }

    public void enterParkingMessage(String vehicleNumber) {
        System.out.println("Your vehicle: " + vehicleNumber + ", is on the parking lot");
    }

    public void exitParkingQuestion() {
        System.out.println("Do You want leave th parking lot?");
    }

    public void exitParkingMessage(String vehicleNumber) {
        System.out.println("Your vehicle: " + vehicleNumber + ", was leave the parking lot");
    }

    public void showAllVehiclesOnParkingLot(List<Vehicle> vehicles) {
        System.out.println("VEHICLE ON PARKING LOT:");
        for (int i = 1; i <= vehicles.size(); i++) {
            System.out.println(i + ". " + vehicles.get(i-1).identificationNumber());
        }
    }

    public void showAllAuthorizedVehicles(List<IdentificationNumber> authorizedVehicles) {
        System.out.println("AUTHORIZED VEHICLE");
        for (int i = 1; i <= authorizedVehicles.size(); i++) {
            System.out.println(i + ". " + authorizedVehicles.get(i-1).identificationNumber());
        }
    }
}
