package com.backend.aeondrivers.dao;

import com.backend.aeondrivers.person.Client;

import java.util.ArrayList;

/**
 * @author tsypk on 27.11.2021 04:13
 * @project AeonDrivers
 */
public interface ClientDAO {
    boolean isExist(Client client);

    boolean addClient(Client client);

    ArrayList<Client> getClients();
}
