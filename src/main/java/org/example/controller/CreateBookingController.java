package org.example.controller;


import org.example.services.booking.BookingImpl;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class CreateBookingController implements IController {
    private BookingImpl bookingService;

    public CreateBookingController(BookingImpl bookingService) {
        this.bookingService = bookingService;
    }

    @Override
    public void execute() {
        String result = bookingService.createBooking();
        System.out.println(result);
    }


}
