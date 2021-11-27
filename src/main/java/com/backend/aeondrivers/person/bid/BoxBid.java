package com.backend.aeondrivers.person.bid;

import com.backend.aeondrivers.person.functionalClient.Sender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author tsypk on 27.11.2021 09:11
 * @project AeonDrivers
 */
@AllArgsConstructor
@Getter
@Setter
public class BoxBid extends Bid {
    private Sender sender;

    @Override
    public boolean joinToTrip() {
        return false;
    }

    @Override
    public void addToDashBoard() {

    }
}
