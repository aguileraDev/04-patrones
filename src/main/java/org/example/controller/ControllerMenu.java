package org.example.controller;

import org.example.services.booking.BookingImpl;
import org.example.services.lodging.LodgingImpl;
import org.example.services.room.RoomImpl;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class ControllerMenu {
    private BookingImpl bookingService;
    private LodgingImpl lodgingService;
    private RoomImpl roomService;

    public ControllerMenu(BookingImpl bookingService, LodgingImpl lodgingService, RoomImpl roomService) {
        this.bookingService = bookingService;
        this.lodgingService = lodgingService;
        this.roomService = roomService;
    }

    public IController createController(Integer option) {
        switch (option) {
            case 1:
                return new SearchLodgingController(lodgingService);
            case 2:
                return new ViewAvailableRoomsController(roomService);
            case 3:
                return new CreateBookingController(bookingService);
            case 4:
                return new ViewBookingController(bookingService);
            case 5:
                return new UpdateBookingController(bookingService);
            case 0:
                return null;
            default:
                throw new IllegalArgumentException("Opcion invalida");
        }
    }

}
