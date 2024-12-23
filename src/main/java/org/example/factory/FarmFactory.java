package org.example.factory;

import org.example.model.Farm;
import org.example.model.Hotel;
import org.example.model.Lodging;

import java.time.LocalDate;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class FarmFactory extends LodgingFactory {
    @Override
    public Lodging createLodging(String name, String city, float rating, LocalDate startDate, LocalDate endDate) {
        return new Farm(name, "Finca", city, rating, startDate, endDate);
    }
}
