package com.backend.aeondrivers.registration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.primefaces.model.file.UploadedFile;

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
public class PassengerRegistration {
    private String login;
    private String password;

    private String firstName;
    private String lastName;
    private String bio;
    private UploadedFile img;
}
