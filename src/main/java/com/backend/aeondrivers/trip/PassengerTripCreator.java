package com.backend.aeondrivers.trip;

public class PassengerTripCreator extends TripCreator {
    @Override
    public Trip CreateTrip() {
        return new PackageTrip();
    }
}
