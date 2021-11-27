package com.backend.aeondrivers.person.functionalClient;

import com.backend.aeondrivers.person.Client;
import com.backend.aeondrivers.trip.model.Box;
import lombok.Getter;
import lombok.Setter;

/**
 * @author tsypk on 27.11.2021 08:40
 * @project AeonDrivers
 */
@Getter
@Setter
public class Sender extends Client {
    private Box box;

    public Sender(Client client, Box box) {
        initFields(client);
        this.box = box;
    }

    public Sender(Client client) {
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

