package com.backend.aeondrivers.registration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.inject.Named;

/**
 * @author tsypk on 27.11.2021 04:11
 * @project AeonDrivers
 */
@Named
<<<<<<< Updated upstream
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AdminRegistration {
    private String fullName;
=======
@Getter
@Setter
@ToString
@NoArgsConstructor
public class AdminRegistration {
>>>>>>> Stashed changes
    private String login;
    private String password;
}
