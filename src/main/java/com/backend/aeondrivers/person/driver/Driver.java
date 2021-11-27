package com.backend.aeondrivers.person.driver;

import com.backend.aeondrivers.person.Person;
import com.backend.aeondrivers.trip.Trip;
import lombok.*;

import java.util.ArrayList;

/**
 * @author tsypk on 27.11.2021 04:11
 * @project AeonDrivers
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends Person {
    private ArrayList<Car> cars;
    private int experience;
    private int age;
    private Double kilometers;
    private int tripsDone;
    private Double rating;
    private Trip currentTrip;

    public Driver(String login, String password, String firstName, String lastName, String bio) {
        setLogin(login);
        setPassword(password);
        setFirstName(firstName);
        setLastName(lastName);
        setBio(bio);
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
