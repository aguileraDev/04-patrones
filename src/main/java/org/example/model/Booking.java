package org.example.model;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class Booking {

    User user;
    Lodging lodging;
    Room room;
    private String estimatedArrivalTime;
    private Integer numberOfRoomsForBooking;

    public Booking(User user, Lodging lodging, Room room, String estimatedArrivalTime, Integer numberOfRoomsForBooking) {
        this.user = user;
        this.lodging = lodging;
        this.room = room;
        this.estimatedArrivalTime = estimatedArrivalTime;
        this.numberOfRoomsForBooking = numberOfRoomsForBooking;
    }

    public Booking() {}

    public User getUser() {
        return user;
    }

    public Lodging getLodging() {
        return lodging;
    }

    public void setLodging(Lodging lodging) {
        this.lodging = lodging;
    }

    public String getEstimatedArrivalTime() {
        return estimatedArrivalTime;
    }


    public Integer getNumberOfRoomsForBooking() {
        return numberOfRoomsForBooking;
    }

    public void setNumberOfRoomsForBooking(Integer numberOfRoomsForBooking) {
        this.numberOfRoomsForBooking = numberOfRoomsForBooking;
    }
}
