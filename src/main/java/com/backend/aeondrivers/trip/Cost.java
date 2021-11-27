package com.backend.aeondrivers.trip;

import com.backend.aeondrivers.exceptions.InvalidValueException;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Cost {
    private int cost;

    public void validCost() throws InvalidValueException {
        if (cost < 0) {
            throw new InvalidValueException("Некорректный ввод стоимости");
        }
    }

}
