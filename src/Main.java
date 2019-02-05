import models.Car;
import models.ParkingLot;
import models.VehicleOnParkingException;
import views.MainView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MainView mainView = new MainView();
        Scanner scanner = new Scanner(System.in);

        ParkingLot parkingLot = new ParkingLot();

        mainView.welcomeMessage();
        mainView.appInfo();

        mainView.vehicleNumberQuestion();
        String vehicleNumber = scanner.nextLine();
        Car car = new Car(vehicleNumber);
        mainView.vehicleNumberScanningMessage(vehicleNumber);

        mainView.showAllVehiclesOnParkingLot(parkingLot.getVehiclesOnParkingLot());
        mainView.showAllAuthorizedVehicles(parkingLot.getAuthorizedVehicles());

        mainView.authorizeInfo();
        if (parkingLot.isVehicleOnAuthorizedList(car)) {
            mainView.vehicleIsAuthorized(car.identificationNumber());
        } else {
            mainView.vehicleIsNotRegisterMessage(car.identificationNumber());
            mainView.registerQuestion();
            mainView.yesOrNoOptions();
            String option = scanner.nextLine();
            boolean isOptionPick = false;
            while(!isOptionPick) {
                if (option.equals("1")) {
                    isOptionPick = parkingLot.addNewAuthorizedVehicle(car);
                }
            }
            mainView.registerVehicleMessage(car.identificationNumber());
        }

        mainView.enterParkingQuestion();
        mainView.yesOrNoOptions();
        String option = scanner.nextLine();
        boolean isOptionPick = false;
        while(!isOptionPick) {
            if (option.equals("1")) {
                try {
                    isOptionPick = parkingLot.addVehicleOnParkingLot(car);
                } catch(VehicleOnParkingException e) {
                    System.out.println(e);
                }
            }
        }
        mainView.enterParkingMessage(car.identificationNumber());

        mainView.exitParkingQuestion();
        mainView.yesOrNoOptions();
        option = scanner.nextLine();
        isOptionPick = false;
        while(!isOptionPick) {
            if (option.equals("1")) {
                isOptionPick = parkingLot.removeVehicleFromParkingLot(car);
            }
        }
        mainView.exitParkingMessage(car.identificationNumber());
    }
}
