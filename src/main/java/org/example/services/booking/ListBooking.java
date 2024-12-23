package org.example.services.booking;

import org.example.model.Booking;
import org.example.repository.BookingRepository;
import org.example.services.interfaces.ICommand;

import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class ListBooking implements ICommand<List<Booking>> {
   private BookingRepository bookingRepository;

   public ListBooking(){
       this.bookingRepository = BookingRepository.getInstance();
   }
    @Override
    public List<Booking> execute() {
      return bookingRepository.getBookings();
    }
}
