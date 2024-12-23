package org.example.factory.initializer;

import org.example.model.Lodging;
import org.example.model.Room;

import java.time.LocalDate;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class HotelInitializer {

    public static Lodging createHotelSunsol(){
        Lodging sunsol = LodgingInitializer.initializeLodging("Sunsol Caribe","hotel", "Margarita", 4.7F, LocalDate.parse("2024-12-01"), LocalDate.parse("2024-12-30"));
        sunsol.addRoom(new Room(1,"Simple", "1 cama sencilla, aire acondicionado, escritorio, TV", 80.00, 10,1,0));
        sunsol.addRoom(new Room(2,"Doble", "2 camas dobles, vista al mar, aire acondicionado, TV", 150.00, 8,2,2));
        sunsol.addRoom(new Room(3,"Suite", "1 cama King, jacuzzi, minibar, aire acondicionado, TV", 300.00, 5,2,0));
        sunsol.addRoom(new Room(4,"Familiar", "3 camas dobles, sala de estar, cocina equipada, aire acondicionado, TV", 250.00, 4,3,3));
        sunsol.addRoom(new Room(5,"Premium", "2 camas Queen, terraza privada, jacuzzi, minibar", 400.00, 2,2,2));

        return sunsol;
    }

    public static Lodging createHotelHesperia(){
        Lodging hesperia = LodgingInitializer.initializeLodging("Hotel Hesperia Isla Margarita", "hotel", "Margarita", 4.5F,LocalDate.parse("2024-12-01"), LocalDate.parse("2024-12-30"));
        hesperia.addRoom(new Room(1,"Estandar", "1 cama Queen, aire acondicionado, escritorio, TV", 100.00, 12,2,0));
        hesperia.addRoom(new Room(2,"Deluxe", "1 cama King, balcón con vista al mar, minibar, aire acondicionado", 180.00, 6,2,0));
        hesperia.addRoom(new Room(3,"Junior Suite", "1 cama King, sala pequeña, minibar, TV de pantalla plana", 250.00, 4,2,0));
        hesperia.addRoom(new Room(4,"Suite Ejecutiva", "1 cama King, sala de estar, jacuzzi, minibar, aire acondicionado", 350.00, 3,2,0));
        hesperia.addRoom(new Room(5,"Suite Presidencial", "1 cama King, terraza privada, piscina exclusiva, aire acondicionado", 500.00, 1,2,0));

        return hesperia;
    }

    public static Lodging createHotelPalmBeach(){
        Lodging ldPalmBeach = LodgingInitializer.initializeLodging("LD Hotel Palm Beach", "hotel", "Margarita", 4.7F, LocalDate.parse("2024-12-01"), LocalDate.parse("2024-12-30"));
        ldPalmBeach.addRoom(new Room(1,"Económica", "1 cama matrimonial, aire acondicionado, TV", 60.00, 12,2,0));
        ldPalmBeach.addRoom(new Room(2,"Estándar", "1 cama Queen, balcón con vista parcial al mar, aire acondicionado", 100.00, 8,2,0));
        ldPalmBeach.addRoom(new Room(3,"Deluxe", "1 cama King, minibar, aire acondicionado, vista al mar", 150.00, 6,2,0));
        ldPalmBeach.addRoom(new Room(4,"Junior Suite", "1 cama King, sala pequeña, balcón con vista al mar, minibar", 200.00, 3,2,0));
        ldPalmBeach.addRoom(new Room(5,"Suite Ejecutiva", "1 cama King, sala de estar, jacuzzi, terraza privada con vista al mar", 300.00, 2,2,0));
        return ldPalmBeach;
    }

}
