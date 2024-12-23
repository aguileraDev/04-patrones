package org.example.factory.util;

import org.example.factory.initializer.ApartmentInitializer;
import org.example.factory.initializer.FarmInitializer;
import org.example.factory.initializer.HotelInitializer;
import org.example.factory.initializer.SunnyDayInitializer;
import org.example.model.Lodging;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class CreateLodgings {

    public static List<Lodging> initializeLodgingList() {
        List<Lodging> lodgingList = new LinkedList<>();
        lodgingList.add(HotelInitializer.createHotelSunsol());
        lodgingList.add(HotelInitializer.createHotelHesperia());
        lodgingList.add(HotelInitializer.createHotelPalmBeach());
        lodgingList.add(FarmInitializer.createFarmFincaMaribel());
        lodgingList.add(SunnyDayInitializer.createBahiaDorada());
        lodgingList.add(FarmInitializer.createPosadaBequeve());
        lodgingList.add(ApartmentInitializer.createApartmentKasaKaribe());
        lodgingList.add(ApartmentInitializer.createApartmentCasaMaya());

        return lodgingList;
    }
}
