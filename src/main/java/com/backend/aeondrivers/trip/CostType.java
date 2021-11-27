package com.backend.aeondrivers.trip;

public enum CostType {
    CASH("наличными"),
    CASHLESS("переводом");
    private final String name;

    CostType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
