package org.example.controller;


import org.example.services.booking.BookingImpl;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class UpdateBookingController implements IController {
    private BookingImpl bookingService;

    public UpdateBookingController(BookingImpl bookingService) {
        this.bookingService = bookingService;
    }

    @Override
    public void execute() {
        String result = bookingService.updateBooking();
        System.out.println(result);
    }
}
