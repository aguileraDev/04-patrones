package org.example.controller;

import org.example.services.room.RoomImpl;



/**
 * @author Manuel Aguilera / @aguileradev
 */
public class ViewAvailableRoomsController implements IController {
    private RoomImpl roomService;

    public ViewAvailableRoomsController(RoomImpl roomService) {
        this.roomService = roomService;
    }

    @Override
    public void execute() {
/*        String lodgingName = ConsoleUtil.captureString("Ingrese el nombre del alojamiento: ");
        Lodging lodging = roomService.findLodgingByName(lodgingName);
        if (lodging == null) {
            System.out.println("No se encontro el alojamiento con el nombre: " + lodgingName);
        } else {
            Integer roomsNeeded = ConsoleUtil.captureInteger("Ingrese la cantidad de habitaciones necesarias: ");
            List<Room> availableRooms = roomService.findAvailableRooms(lodging, roomsNeeded);
            roomService.printRooms(availableRooms);
        }*/
    }
}


