package com.backend.aeondrivers.storage;

import com.backend.aeondrivers.dao.ClientDAO;
import com.backend.aeondrivers.person.Client;
import com.backend.aeondrivers.registration.ClientLogin;
import com.backend.aeondrivers.registration.ClientReg;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;

/**
 * @author tsypk on 27.11.2021 22:33
 * @project AeonDrivers
 */
@Named
@ApplicationScoped
@Getter
@Setter
@ToString
public class ClientStorage {
    private ArrayList<Client> clients;
    private ClientDAO clientDAO;
    @Inject
    private ClientReg clientReg;
    @Inject
    private ClientLogin clientLogin;

    public ClientStorage() {
        initClients();
    }

    public void addClient() {
        Client curClient = clientReg.getClient();
        if (clientDAO.addClient(curClient)) {
            addClient(curClient);
        }
    }

    public Client getClientByLogin(String login) {
        for (Client client : clients) {
            if (client.getLogin().equals(login))
                return client;
        }
        return null;
    }

    private void initClients() {
        clients = getClientDAO().getClients();
        if (clientDAO == null) {
            clients = new ArrayList<>();
        }
    }

    private void addClient(Client client) {
        clients.add(client);
    }
}
