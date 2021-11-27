package com.backend.aeondrivers.admin;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author tsypk on 27.11.2021 04:11
 * @project AeonDrivers
 */
@AllArgsConstructor
@Data
public class Admin {
    private final String login;
    private final String password;
}
