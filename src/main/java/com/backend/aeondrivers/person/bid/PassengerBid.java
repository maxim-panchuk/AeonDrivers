package com.backend.aeondrivers.person.bid;

import com.backend.aeondrivers.person.functionalClient.Passenger;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author tsypk on 27.11.2021 09:12
 * @project AeonDrivers
 */
@AllArgsConstructor
@Getter
@Setter
public class PassengerBid extends Bid {
    private Passenger passenger;

    @Override
    public boolean joinToTrip() {
        return false;
    }

    @Override
    public void addToDashBoard() {

    }
}
