package org.example.factory;

import org.example.model.Lodging;
import org.example.model.SunnyDay;

import java.time.LocalDate;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class SunnyDayFactory extends LodgingFactory{
    @Override
    public Lodging createLodging(String name, String city, float rating, LocalDate startDate, LocalDate endDate) {
        return new SunnyDay(name, "Dia de sol", city, rating, startDate, endDate);
    }
}
