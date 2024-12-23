package org.example.services.interfaces;

import org.example.model.Lodging;
import org.example.model.Room;

import java.util.List;
/**
 * @author Manuel Aguilera / @aguileradev
 */
public interface IBooking {

    String createBooking();
    void listBookings();
    String updateBooking();

}
