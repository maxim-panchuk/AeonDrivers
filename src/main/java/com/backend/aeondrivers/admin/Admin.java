package com.backend.aeondrivers.admin;

import com.backend.aeondrivers.dao.DriverDAO;
import com.backend.aeondrivers.dao.Drivers;
import com.backend.aeondrivers.dao.ClientDAO;
import com.backend.aeondrivers.dao.ClientDAOImpl;
import com.backend.aeondrivers.registration.DriverRegistration;
import com.backend.aeondrivers.registration.ClientReg;

import javax.inject.Inject;

/**
 * @author tsypk on 27.11.2021 04:11
 * @project AeonDrivers
 */

public class Admin {
    private static Admin admin;
    private static final DriverDAO driverDAO = new Drivers();
    private static final ClientDAO CLIENT_DAO = new ClientDAOImpl();
    @Inject
    private ClientReg passengerRegistration;
    @Inject
    private DriverRegistration driverRegistration;

    public static Admin GetInstance() {
        if (admin == null)
            admin = new Admin();
        return admin;
    }
}
