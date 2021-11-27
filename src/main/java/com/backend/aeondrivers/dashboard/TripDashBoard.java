package com.backend.aeondrivers.dashboard;

import com.backend.aeondrivers.trip.Trip;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author tsypk on 27.11.2021 12:21
 * @project AeonDrivers
 */
@NoArgsConstructor
@Getter
@Setter
public class TripDashBoard {
    private static ArrayList<Trip> trips;

    /**
     * @param trip adding trip
     * @return index of the added element
     */
    public static int addTrip(Trip trip) {
        trips.add(trip);
        return trips.size() - 1;
    }

    public static void removeTrip(Trip trip) {
        trips.remove(trip);
    }

    public static void removeTripByIndex(int index) {
        trips.remove(index);
    }
}
