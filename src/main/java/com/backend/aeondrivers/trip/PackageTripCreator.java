package com.backend.aeondrivers.trip;

public class PackageTripCreator extends TripCreator {
    @Override
    public Trip CreateTrip() {
        return new PackageTrip();
    }
}
