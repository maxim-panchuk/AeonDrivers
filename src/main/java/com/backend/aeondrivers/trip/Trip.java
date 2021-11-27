package com.backend.aeondrivers.trip;

import com.backend.aeondrivers.person.Client;
import com.backend.aeondrivers.person.driver.Driver;
import com.backend.aeondrivers.trip.model.Cost;
import com.backend.aeondrivers.trip.model.Route;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

/**
 * @author tsypk on 27.11.2021 04:11
 * @project AeonDrivers
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class Trip {
    private Driver driver;
    private Route route;
    private Cost cost;
    private ArrayList<Client> clients;
}
