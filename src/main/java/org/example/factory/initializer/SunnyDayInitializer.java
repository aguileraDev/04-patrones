package org.example.factory.initializer;

import org.example.model.Lodging;
import org.example.model.Room;
import org.example.model.SunnyDay;

import java.time.LocalDate;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class SunnyDayInitializer {

    public static Lodging createBahiaDorada(){
        Lodging bahiaDorada = LodgingInitializer.initializeLodging("Cabaña Vacacional Bahía Dorada","dia de sol", "Margarita", 4.7F, LocalDate.parse("2024-12-01"), LocalDate.parse("2024-12-30"));
        bahiaDorada.addRoom(new Room(1,"Cabaña Básica", "1 cama Queen, ventilador, baño privado, terraza", 80.00, 10,2,1));
        bahiaDorada.addRoom(new Room(2,"Cabaña Familiar", "2 camas dobles, sala pequeña, cocina equipada", 150.00, 6,2,2));
        bahiaDorada.addRoom(new Room(3,"Cabaña Deluxe", "1 cama King, jacuzzi privado, aire acondicionado, minibar", 200.00, 3,2,1));
        bahiaDorada.addRoom(new Room(4,"Cabaña Suite", "1 cama King, terraza privada con hamaca, minibar", 250.00, 2,2,0));
        bahiaDorada.addRoom(new Room(5,"Cabaña Presidencial", "1 cama King, terraza exclusiva, piscina privada, jacuzzi", 400.00, 1,2,0));

        return bahiaDorada;
    }
}
