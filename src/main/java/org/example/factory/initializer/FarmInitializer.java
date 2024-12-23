package org.example.factory.initializer;

import org.example.model.Farm;
import org.example.model.Lodging;
import org.example.model.Room;

import java.time.LocalDate;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class FarmInitializer {

    public static Lodging createFarmFincaMaribel(){
        Lodging fincaMaribel = LodgingInitializer.initializeLodging("Finca Maribel", "finca", "Margarita", 4.7F, LocalDate.parse("2024-12-01"), LocalDate.parse("2024-12-30"));
        fincaMaribel.addRoom(new Room(1,"Rústica Simple", "1 cama sencilla, ventilador, escritorio, baño privado", 50.00, 10,1,0));
        fincaMaribel.addRoom(new Room(2,"Rústica Familiar", "2 camas dobles, pequeña cocina, aire acondicionado, TV", 120.00, 5,2,2));
        fincaMaribel.addRoom(new Room(3,"Cabaña Rústica", "1 cama Queen, terraza con hamaca, minibar", 150.00, 3,2,0));
        fincaMaribel.addRoom(new Room(4,"Cabaña Deluxe", "1 cama King, terraza privada con vista al jardín, cocina equipada", 200.00, 2,2,0));
        fincaMaribel.addRoom(new Room(5,"Cabaña Premium", "1 cama King, sala de estar, jacuzzi exterior, minibar", 300.00, 1,2,0));
        return fincaMaribel;
    }

    public static Lodging createPosadaBequeve(){
        Lodging posadaBequeve = LodgingInitializer.initializeLodging("Posada Bequeve", "finca", "Margarita", 4.7F, LocalDate.parse("2024-12-01"), LocalDate.parse("2024-12-30"));
        posadaBequeve.addRoom(new Room(1,"Habitación Básica", "1 cama Queen, ventilador, baño privado", 70.00, 8,2,0));
        posadaBequeve.addRoom(new Room(2,"Habitación Familiar", "2 camas matrimoniales, cocina equipada, aire acondicionado", 140.00, 5,2,2));
        posadaBequeve.addRoom(new Room(3,"Cabaña Rústica", "1 cama King, minibar, aire acondicionado", 180.00, 4,2,0));
        posadaBequeve.addRoom(new Room(4,"Cabaña Deluxe", "1 cama King, jacuzzi, terraza privada, cocina equipada", 250.00, 2,2,0));
        posadaBequeve.addRoom(new Room(5,"Cabaña Premium", "1 cama King, sala de estar, jacuzzi exterior, minibar", 320.00, 1,2,0));
        return  posadaBequeve;
    }

}
