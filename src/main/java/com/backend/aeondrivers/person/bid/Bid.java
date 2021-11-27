package com.backend.aeondrivers.person.bid;

import com.backend.aeondrivers.person.Client;
import lombok.Getter;
import lombok.Setter;

/**
 * @author tsypk on 27.11.2021 09:07
 * @project AeonDrivers
 */
@Getter
@Setter
public abstract class Bid {
    private Client client;
    private String title;
    private String description;

    public abstract boolean joinToTrip();

    public abstract void addToDashBoard();
}
