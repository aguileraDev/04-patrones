package org.example.factory.initializer;

import org.example.model.Lodging;
import org.example.model.Room;

import java.time.LocalDate;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class ApartmentInitializer {

    public static Lodging createApartmentKasaKaribe(){
        Lodging kasaKaribe = LodgingInitializer.initializeLodging("Apartamento Kasa Karibe","apartamento",  "Margarita", 4.7F, LocalDate.parse("2024-12-01"), LocalDate.parse("2024-12-30"));
        kasaKaribe.addRoom(new Room(1,"Estudio Básico", "1 cama Queen, cocina básica, TV", 90.00, 10,2,0));
        kasaKaribe.addRoom(new Room(2,"Loft Familiar", "2 camas matrimoniales, cocina equipada, aire acondicionado", 150.00, 6,2,2));
        kasaKaribe.addRoom(new Room(3,"Penthouse", "1 cama King, terraza con vista al mar, jacuzzi", 300.00, 2,2,0));
        kasaKaribe.addRoom(new Room(4,"Dúplex", "2 camas matrimoniales, sala y cocina completa", 180.00, 3,2,2));
        kasaKaribe.addRoom(new Room(5,"Estudio Premium", "1 cama King, minibar, aire acondicionado, TV", 120.00, 4,2,0));
        return kasaKaribe;
    }
    public static Lodging createApartmentCasaMaya(){
        Lodging casaMaya = LodgingInitializer.initializeLodging("Casa Maya Guesthouse","apartamento",  "Margarita", 4.7F, LocalDate.parse("2024-12-01"), LocalDate.parse("2024-12-30"));
        casaMaya.addRoom(new Room(1,"Estudio", "1 cama Queen, cocina pequeña, aire acondicionado, TV", 90.00, 7,2,0));
        casaMaya.addRoom(new Room(2,"Loft", "1 cama King, sala de estar, cocina equipada", 130.00, 5,2,0));
        casaMaya.addRoom(new Room(3,"Penthouse", "1 cama King, terraza privada, jacuzzi, cocina equipada", 300.00, 2,2,0));
        casaMaya.addRoom(new Room(4,"Dúplex", "2 camas matrimoniales, cocina, sala de estar, aire acondicionado", 180.00, 3,2,2));
        casaMaya.addRoom(new Room(5,"Estudio Premium", "1 cama Queen, minibar, aire acondicionado", 120.00, 4,2,0));
        return casaMaya;
    }
}
