package com.backend.aeondrivers.dao;

import com.backend.aeondrivers.person.driver.Driver;
import com.backend.aeondrivers.trip.Trip;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author tsypk on 27.11.2021 22:15
 * @project AeonDrivers
 */
@NoArgsConstructor
@Getter
@Setter
public class TripDAOImpl implements TripDAO {

    @Override
    public ArrayList<Trip> getTrips() {
        return null;
    }

    @Override
    public boolean addTrip(Trip trip) {
        return true;
    }

    @Override
    public ArrayList<Trip> getTripsOfDriver(Driver driver) {
        return null;
    }

    @Override
    public boolean removeTrip(Trip trip) {
        return true;
    }

    @Override
    public boolean removeTripsOfDriver(Driver driver) {
        return true;
    }
}
