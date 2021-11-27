package com.backend.aeondrivers.admin;

import com.backend.aeondrivers.dao.*;
import com.backend.aeondrivers.driver.Driver;
import com.backend.aeondrivers.passenger.Passenger;
import com.backend.aeondrivers.registration.DriverRegistration;
import com.backend.aeondrivers.registration.PassengerRegistration;
import com.backend.aeondrivers.trip.Trip;

import javax.inject.Inject;

/**
 * @author tsypk on 27.11.2021 04:11
 * @project AeonDrivers
 */

public class Admin {
    private static Admin admin;
    private static final DriverDAO driverDAO = new Drivers();
    private static final PassengerDAO passengerDAO = new PassengerDAOImpl();

    public static Admin GetInstance() {
        if (admin == null)
            admin = new Admin();
        return admin;
    }

    @Inject
    private PassengerRegistration passengerRegistration;

    public Passenger RegisterPassenger() {
        Passenger passenger = new Passenger();
        passenger.setPassword(passengerRegistration.getPassword());
        passenger.setLogin(passengerRegistration.getLogin());
        passenger.setFullName(passengerRegistration.getFullName());
        return passenger;
    }

    @Inject
    private DriverRegistration driverRegistration;

    public Driver RegisterDriver() {
        Driver driver = new Driver();

        return driver;
    }
}
