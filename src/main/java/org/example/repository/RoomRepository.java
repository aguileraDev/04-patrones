package org.example.repository;

import org.example.model.Room;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class RoomRepository {

    private static RoomRepository INSTANCE;

    private List<Room> rooms;

    private RoomRepository(){
        this.rooms = new LinkedList<>();
    }

    public static synchronized RoomRepository getInstance(){
        if(INSTANCE == null){
            INSTANCE = new RoomRepository();
        }
        return INSTANCE;
    }

    public List<Room> getRooms() {
        return rooms;
    }
    public void addRoom(Room room){
       rooms.add(room);
    }
}
