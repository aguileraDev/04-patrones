package org.example.services.booking;

import org.example.model.Booking;
import org.example.repository.BookingRepository;
import org.example.services.interfaces.ICommand;

import java.time.LocalDate;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class UpdateBooking implements ICommand<String> {
    private BookingRepository bookingRepository;

    public UpdateBooking(){
        this.bookingRepository = BookingRepository.getInstance();
    }
    @Override
    public String execute() {
 /*       String email = ConsoleUtil.captureString("Ingrese su correo electronico: ");
        LocalDate birthDate = ConsoleUtil.captureDate("Ingrese su fecha de nacimiento (yyyy-mm-dd): ");
        Booking existingBooking = getExistingBookingByEmailAndBirthDate(email, birthDate);
        if (existingBooking == null) {
            return "Reserva no encontrada.";
        }
        System.out.println(existingBooking);
        if (shouldUpdateRoom()) {
            updateRoom(existingBooking);
        }
        if (shouldUpdateLodging()) {
            updateLodging(existingBooking);
        }
        */
        return "Reserva actualizada exitosamente";
    }

    private Booking getExistingBookingByEmailAndBirthDate(String email, LocalDate birthDate) {
        return bookingRepository.getBookings().stream()
                .filter(b -> b.getUser().getEmail().equals(email) && b.getUser().getBirthDate().equals(birthDate))
                .findFirst()
                .orElse(null);
    }
}
