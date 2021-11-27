package com.backend.aeondrivers.person;

import lombok.Getter;
import lombok.Setter;

/**
 * @author tsypk on 27.11.2021 04:10
 * @project AeonDrivers
 */
@Getter
@Setter
public abstract class Person {
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String bio;
}
