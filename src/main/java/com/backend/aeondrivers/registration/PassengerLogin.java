package com.backend.aeondrivers.registration;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.inject.Named;

/**
 * @author tsypk on 27.11.2021 04:10
 * @project AeonDrivers
 */
@Named
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PassengerLogin {
    private String login;
    private String password;
}
