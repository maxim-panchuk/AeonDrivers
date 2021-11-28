package com.backend.aeondrivers.utils.nav;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.inject.Named;

/**
 * @author tsypk on 27.11.2021 21:08
 * @project AeonDrivers
 */
@Named
@Getter
@Setter
@NoArgsConstructor
@ToString
public class NavigationBean {
    String param = "?faces-redirect=true";
    // ADMIN

    public String redAdminLog() {
        return "templates/admin/admin-login?faces-redirect=true";
    }

    // CLIENT

    public String redClientLog() {
        return "templates/client/client-login?faces-redirect=true";
    }

    public String redClientReg() {
        return "templates/client/client-reg?faces-redirect=true";
    }

    public String redClientAccFromClient() {
        return "client-account" + param;
    }

    // DRIVER

    public String redDriverReg() {
        return "templates/driver/driver-reg?faces-redirect=true";
    }

    public String redDriverLog() {
        return "templates/auth/driver-login" + param;
    }

    public String redDriverAccFromDriver() {
        return "driver-account" + param;
    }

    public String redDriverPhotoFromDriver() {
        return "driver-photos" + param;
    }


    //INDEX

    public String redIndex() {
        return "index" + param;
    }
}
