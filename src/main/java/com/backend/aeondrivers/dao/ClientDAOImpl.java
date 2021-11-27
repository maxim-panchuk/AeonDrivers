package com.backend.aeondrivers.dao;

import com.backend.aeondrivers.person.Client;

import java.util.ArrayList;

public class ClientDAOImpl implements ClientDAO {
    @Override
    public boolean isExist(Client client) {
        if (client.getLogin().equals("nurgun") && client.getPassword().equals("makarov")) {
            return true;
        } else
            return false;
    }

    @Override
    public boolean addClient(Client client) {
        return true;
    }

    @Override
    public ArrayList<Client> getClients() {
        return new ArrayList<>();
    }
}
