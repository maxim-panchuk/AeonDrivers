package com.backend.aeondrivers.person.driver;

import com.backend.aeondrivers.person.Person;
import com.backend.aeondrivers.trip.Trip;
import com.backend.aeondrivers.utils.document.DriverDocument;
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
    private ArrayList<DriverDocument> documents;
    private Double rating;
    private Trip currentTrip;

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addDocument(DriverDocument document) {
        documents.add(document);
    }

}
