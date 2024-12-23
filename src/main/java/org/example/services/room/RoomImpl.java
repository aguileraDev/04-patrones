package org.example.services.room;

import org.example.model.Booking;
import org.example.model.Lodging;
import org.example.model.Room;
import org.example.repository.RoomRepository;
import org.example.utils.ConsoleUtil;

import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class RoomImpl  {
    private RoomRepository roomRepository;

    public RoomImpl(){
        this.roomRepository = RoomRepository.getInstance();
    }


    public List<Room> fetchRoomsByAvaibility (Lodging selectedLodging, Integer numberOfRooms){
        return selectedLodging.getRooms().stream()
                .filter(room -> room.getAvaibility() >= numberOfRooms)
                .toList();
    }

    private boolean shouldUpdateRoom() {
        String response = ConsoleUtil.captureString("desea cambiar la habitacion (s/n): ");
        return response.equalsIgnoreCase("s");
    }
    private void updateRoom(Booking existingBooking) {
        Integer newRoomCount = ConsoleUtil.captureInteger("Ingrese el numero de habitaciones necesarias: ");
        existingBooking.setNumberOfRoomsForBooking(newRoomCount);
        System.out.println("numero de habitaciones actualizado.");
    }

    public void printRooms(List<Room> rooms) {
        if (!rooms.isEmpty()) {
            System.out.println("------- Habitaciones disponibles --------");
            for (int i = 0; i < rooms.size(); i++) {
                System.out.printf("Opcion %d:%n%s%n", i + 1, rooms.get(i).toString());
            }
        }
    }

}
