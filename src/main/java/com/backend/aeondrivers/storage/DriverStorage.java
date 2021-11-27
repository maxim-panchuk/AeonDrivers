package com.backend.aeondrivers.storage;

import com.backend.aeondrivers.dao.DriverDAO;
import com.backend.aeondrivers.person.driver.Driver;
import com.backend.aeondrivers.registration.DriverLogin;
import com.backend.aeondrivers.registration.DriverRegistration;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;

/**
 * @author tsypk on 28.11.2021 01:31
 * @project AeonDrivers
 */
@Named
@ApplicationScoped
@Getter
@Setter
@ToString
public class DriverStorage {
    private ArrayList<Driver> drivers;
    private DriverDAO driverDAO;
    @Inject
    private DriverLogin driverLogin;
    @Inject
    private DriverRegistration driverRegistration;

    public DriverStorage() {
        initDrivers();

        String login = "maxim";
        String password = "maxim";
        String name = "Панчук Максим Константинович";
        String lastName = "Панчук";
        String bio = "опытный водитель";
        Driver driver = new Driver(login, password, name, lastName, bio);

        int experience = 5;
        int age = 19;
        Double kilometers = 51234.5d;
        int tripsDone = 978;
        Double rating = 5.0d;

        driver.setExperience(experience);
        driver.setAge(age);
        driver.setKilometers(kilometers);
        driver.setTripsDone(tripsDone);
        driver.setRating(rating);

        addDriver(driver);
    }

    public Driver getDriverByLogin(String login) {
        for (Driver driver : drivers) {
            if (driver.getLogin().equals(login))
                return driver;
        }
        return null;
    }

    private void addDriver(Driver driver) {
        drivers.add(driver);
    }

    private void initDrivers() {
        if (drivers == null)
            drivers = new ArrayList<>();
    }
}
