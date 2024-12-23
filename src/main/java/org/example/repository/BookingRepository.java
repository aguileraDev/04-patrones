package org.example.repository;

import org.example.model.Booking;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class BookingRepository {
    private List<Booking> bookings;


    private BookingRepository(){
        this.bookings = new LinkedList<>();
    }

    private static class BookingRepositoryHolder {
        private static final BookingRepository INSTANCE = new BookingRepository();
    }

    public static BookingRepository getInstance() {
        return BookingRepositoryHolder.INSTANCE;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void addBooking(Booking order){
        bookings.add(order);
    }

}