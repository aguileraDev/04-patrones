package org.example.factory;

import org.example.model.Hotel;
import org.example.model.Lodging;

import java.time.LocalDate;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class HotelFactory extends LodgingFactory {

    @Override
    public Lodging createLodging(String name, String city, float rating, LocalDate startDate, LocalDate endDate) {
        return new Hotel(name, "Hotel", city, rating, startDate, endDate);
    }

}

