package com.backend.aeondrivers.driver;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public enum CarClass {

    FOREIGNCAR("иномарка"),
    JEEP("джип"),
    MINIVAN("минивэн");
    private String url;

    CarClass(String url) {
        this.url = url;
    }
}
