package models.samples;

import models.Car;
import models.IdentificationNumber;

import java.util.ArrayList;
import java.util.List;

public class AuthorizedVehicles {

    private List<IdentificationNumber> authorizedVehicles;

    public AuthorizedVehicles() {
        authorizedVehicles = new ArrayList<>();
        authorizedVehicles.add(new Car("DW 88999"));
        authorizedVehicles.add(new Car("DW 88998"));
        authorizedVehicles.add(new Car("DW 88997"));
        authorizedVehicles.add(new Car("DW 88996"));
        authorizedVehicles.add(new Car("DW 88995"));
    }

    public List<IdentificationNumber> getAuthorizedVehicles() {
        return authorizedVehicles;
    }
}
