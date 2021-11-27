package com.backend.aeondrivers.dao;

import com.backend.aeondrivers.person.driver.Driver;
import com.backend.aeondrivers.trip.Trip;

import java.util.ArrayList;

/**
 * @author tsypk on 27.11.2021 22:14
 * @project AeonDrivers
 */
public interface TripDAO {
    ArrayList<Trip> getTrips();

    boolean addTrip(Trip trip);

    ArrayList<Trip> getTripsOfDriver(Driver driver);

    boolean removeTrip(Trip trip);

    boolean removeTripsOfDriver(Driver driver);
}
