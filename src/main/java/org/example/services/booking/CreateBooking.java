package org.example.services.booking;

import org.example.model.Booking;
import org.example.model.Lodging;
import org.example.model.Room;
import org.example.model.User;
import org.example.services.interfaces.ICommand;
import org.example.utils.ConsoleUtil;

import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class CreateBooking implements ICommand<Booking> {

    @Override
    public Booking execute() {
    /*    System.out.println("Creando una nueva reserva...");
        String lodgingName = ConsoleUtil.captureString("Ingrese el nombre del alojamiento: ");
        Lodging selectedLodging = findLodgingByName(lodgingName);
        if (selectedLodging == null) {
            return "El alojamiento ingresado no existe.";
        }
        System.out.println("Habitaciones disponibles en " + lodgingName + ":");
        selectedLodging.getRooms().forEach(System.out::println);
        Integer numberOfRooms = ConsoleUtil.captureInteger("Ingrese la cantidad de habitaciones que desea reservar: ");
        List<Room> availableRooms = fetchRoomsByAvaibility(selectedLodging, numberOfRooms);
        if (availableRooms.isEmpty()) {
            return "Error: No hay habitaciones disponibles para esa cantidad";
        }

        User user = captureUserData();
        String arrivalTime = ConsoleUtil.captureString("Ingrese su hora aproximada de llegada (HH:mm): ");

        Booking newBooking = new Booking(user, selectedLodging, arrivalTime, numberOfRooms);

        for (Room room : availableRooms) {
            int remainingRooms = room.getAvaibility() - numberOfRooms;
            room.setAvaibility(remainingRooms);
            numberOfRooms -= room.getAvaibility();
            if (numberOfRooms <= 0) break;
        }*/

        return new Booking();

    }
}
