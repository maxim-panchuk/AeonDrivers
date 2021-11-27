package com.backend.aeondrivers.person.functionalClient;

import com.backend.aeondrivers.person.Client;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author tsypk on 27.11.2021 08:36
 * @project AeonDrivers
 */
@Getter
@Setter
@NoArgsConstructor
public class Passenger extends Client {
    private String passengerInfo;

    public Passenger(Client client, String passengerInfo) {
        initFields(client);
        this.passengerInfo = passengerInfo;
    }

    public Passenger(Client client) {
        initFields(client);
    }

    private void initFields(Client client) {
        setLogin(client.getLogin());
        setPassword(client.getLogin());
        setFirstName(client.getFirstName());
        setLastName(client.getLastName());
        setBio(client.getBio());
    }
}