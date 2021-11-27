package com.backend.aeondrivers.driver;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author tsypk on 27.11.2021 04:11
 * @project AeonDrivers
 */
@NoArgsConstructor
@Getter
@Setter
public class Driver {
    private String firstName;
    private String lastName;
    private String secondName;
    private String login;
    private String password;
    private Double rating;
}
