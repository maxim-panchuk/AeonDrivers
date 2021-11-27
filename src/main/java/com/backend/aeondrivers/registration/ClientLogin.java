package com.backend.aeondrivers.registration;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author tsypk on 27.11.2021 04:10
 * @project AeonDrivers
 */
@Named
@RequestScoped
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ClientLogin {
    private String login;
    private String password;

}
