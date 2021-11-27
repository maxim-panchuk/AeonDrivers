package com.backend.aeondrivers.admin;

import com.backend.aeondrivers.dao.DriverDAO;
import com.backend.aeondrivers.dao.Drivers;
import com.backend.aeondrivers.dao.PassengerDAO;
import com.backend.aeondrivers.dao.PassengerDAOImpl;
import com.backend.aeondrivers.registration.DriverRegistration;
import com.backend.aeondrivers.registration.PassengerRegistration;

import javax.inject.Inject;

/**
 * @author tsypk on 27.11.2021 04:11
 * @project AeonDrivers
 */

public class Admin {
    private static Admin admin;
    private static final DriverDAO driverDAO = new Drivers();
    private static final PassengerDAO passengerDAO = new PassengerDAOImpl();
    @Inject
    private PassengerRegistration passengerRegistration;
    @Inject
    private DriverRegistration driverRegistration;

    public static Admin GetInstance() {
        if (admin == null)
            admin = new Admin();
        return admin;
    }
}
