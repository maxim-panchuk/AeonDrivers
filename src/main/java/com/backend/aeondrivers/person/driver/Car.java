package com.backend.aeondrivers.person.driver;

import com.backend.aeondrivers.utils.document.DriverDocument;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author tsypk on 27.11.2021 08:14
 * @project AeonDrivers
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String carName;
    private String carNumber;
    private ArrayList<DriverDocument> documents;
    private ArrayList<DriverDocument> images;

    private boolean prava;
    private boolean strahovka;
    private boolean dkp;

    public Car(String carName, String carNumber, boolean prava, boolean strahovka, boolean dkp) {
        this.carName = carName;
        this.carNumber = carNumber;
        this.prava = prava;
        this.strahovka = strahovka;
        this.dkp = dkp;
    }

    public void addDocument(DriverDocument document) {
        documents.add(document);
    }

    public void addImage(DriverDocument image) {
        images.add(image);
    }

    public String getPravaColor() {
        return prava ? "green" : "red";
    }

    public String getStrahovkaColor() {
        return strahovka ? "green" : "red";
    }
}
