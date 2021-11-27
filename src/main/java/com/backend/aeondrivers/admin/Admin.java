package com.backend.aeondrivers.admin;

<<<<<<< Updated upstream
import lombok.AllArgsConstructor;
import lombok.Data;
=======
import com.backend.aeondrivers.dao.*;
import com.backend.aeondrivers.driver.Driver;
import com.backend.aeondrivers.passenger.Passenger;
import com.backend.aeondrivers.registration.DriverRegistration;
import com.backend.aeondrivers.registration.PassengerRegistration;

import javax.inject.Inject;
import javax.inject.Singleton;
>>>>>>> Stashed changes

/**
 * @author tsypk on 27.11.2021 04:11
 * @project AeonDrivers
 */
<<<<<<< Updated upstream
@AllArgsConstructor
@Data
public class Admin {
    private final String login;
    private final String password;
=======
// @Singleton
public class Admin {
    private static Admin admin;
    private static final DriverDAO driverDAO = new Drivers();
    private static final PassengerDAO passengerDAO = new PassengerDAOImpl();

    public Admin GetInstance() {
        if (admin == null)
            admin = new Admin();
        return admin;
    }

    @Inject
    private PassengerRegistration passengerRegistration;
    public Passenger RegisterPassenger();

    @Inject
    private DriverRegistration driverRegistration;
    private Driver RegisterDriver();

    private
>>>>>>> Stashed changes
}
