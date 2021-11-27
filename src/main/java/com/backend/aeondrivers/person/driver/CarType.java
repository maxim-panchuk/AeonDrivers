package com.backend.aeondrivers.person.driver;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public enum CarType {

    FOREIGN_CAR("иномарка"),
    JEEP("джип"),
    MINIVAN("минивэн");
    private String name;

    CarType(String url) {
        this.name = url;
    }
}
