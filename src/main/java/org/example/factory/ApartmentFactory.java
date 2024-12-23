package org.example.factory;

import org.example.model.Apartment;
import org.example.model.Lodging;

import java.time.LocalDate;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class ApartmentFactory extends LodgingFactory {
    @Override
    public Lodging createLodging(String name, String city, float rating, LocalDate startDate, LocalDate endDate) {
        String defaultFloor = "3";
        return new Apartment(name, "Apartamento", city, rating, defaultFloor, startDate, endDate);
    }
}
