package org.example.factory.initializer;

import org.example.factory.ApartmentFactory;
import org.example.factory.FarmFactory;
import org.example.factory.HotelFactory;
import org.example.factory.LodgingFactory;
import org.example.factory.SunnyDayFactory;
import org.example.model.Lodging;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class LodgingInitializer {
    public static Lodging initializeLodging(String name,
                                            String category,
                                            String city,
                                            float rating,
                                            LocalDate startDate,
                                            LocalDate endDate) {

        LodgingFactory factory;

        switch (category.toLowerCase()) {
            case "hotel":
                factory = new HotelFactory();
                break;
            case "apartamento":
                factory = new ApartmentFactory();
                break;
            case "finca":
                factory = new FarmFactory();
                break;
            case "dia de sol":
                factory = new SunnyDayFactory();
                break;
            default:
                throw new IllegalArgumentException("Tipo de alojamiento desconocido: " + category);
        }

        return factory.createLodging(name, city, rating, startDate, endDate);
    }

}
