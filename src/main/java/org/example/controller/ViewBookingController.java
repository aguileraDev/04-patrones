package org.example.controller;

import org.example.services.booking.BookingImpl;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class ViewBookingController implements IController {
    private BookingImpl bookingImpl;

    public ViewBookingController(BookingImpl bookingImpl) {
        this.bookingImpl = bookingImpl;
    }
    @Override
    public void execute() {
        bookingImpl.listBookings();
    }
}
