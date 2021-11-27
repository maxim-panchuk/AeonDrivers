package com.backend.aeondrivers.utils.document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author tsypk on 27.11.2021 08:11
 * @project AeonDrivers
 */
@Getter
@Setter
@ToString
public abstract class DriverDocument {
    private String name;
    private String founder;
}
