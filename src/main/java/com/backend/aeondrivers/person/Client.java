package com.backend.aeondrivers.person;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author tsypk on 27.11.2021 08:39
 * @project AeonDrivers
 */
@NoArgsConstructor
@Getter
@Setter
public class Client extends Person {
    public Client(String login, String password, String firstName, String lastName, String bio) {
        setLogin(login);
        setPassword(password);
        setFirstName(firstName);
        setLastName(lastName);
        setBio(bio);
    }
}
