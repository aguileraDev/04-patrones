package org.example.services.booking;

import org.example.model.Booking;
import org.example.controller.IController;
import org.example.repository.BookingRepository;
import org.example.services.interfaces.IBooking;
import org.example.services.lodging.LodgingImpl;
import org.example.services.lodging.SearchLodging;
import org.example.services.room.RoomImpl;
import org.example.utils.ConsoleUtil;
import org.example.repository.LodgingRepository;
import org.example.controller.Menu;
import org.example.controller.ControllerMenu;

import java.util.InputMismatchException;
import java.util.List;

import static org.example.Main.*;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class BookingImpl implements IBooking {
    private LodgingRepository lodgingRepository;
    private BookingRepository bookingRepository;
    private ListBooking listBooking;
    private CreateBooking createBooking;
    private UpdateBooking updateBooking;

    public BookingImpl(ListBooking listBooking, CreateBooking createBooking, UpdateBooking updateBooking){
        this.lodgingRepository = LodgingRepository.getInstance();
        this.bookingRepository = BookingRepository.getInstance();
        this.listBooking = listBooking;
        this.createBooking = createBooking;
        this.updateBooking = updateBooking;

    }

    public static void menu () {
        int option = 1;
        BookingImpl bookingService = new BookingImpl(new ListBooking(), new CreateBooking(), new UpdateBooking());
        LodgingImpl lodgingService = new LodgingImpl(new SearchLodging());
        RoomImpl roomService = new RoomImpl();

        ControllerMenu controllerMenu = new ControllerMenu(bookingService, lodgingService, roomService);

            do {
                Menu.display();
                try {
                    option = ConsoleUtil.captureInteger("Selecciona una opcion");
                } catch (InputMismatchException | NumberFormatException e) {
                    System.out.println("Debes ingresar un numero");
                    option = 7;
                }
                input.nextLine();
                IController menuOption = controllerMenu.createController(option);
                menuOption.execute();

            } while (option != 0);

    }

    @Override
    public void listBookings() {
        List<Booking> bookingList = listBooking.execute();
        if(bookingList.isEmpty()){
            System.out.println("No hay reservas realizadas");
        }

        bookingList.stream().forEach(System.out::println);
    }

    @Override
    public String createBooking() {
        createBooking.execute();
        return "Reserva creada exitosamente.";

    }


    @Override
    public String updateBooking() {
        return updateBooking.execute();

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Booking data : bookingRepository.getBookings()) {
            sb.append("usuario: ").append(data.getUser())
                    .append("\nalojamiento: ").append(data.getLodging().getName())
                    .append("\ncategoria: ").append(data.getLodging().getCategory())
                    .append("\nfecha de llegada estimada: ").append(data.getEstimatedArrivalTime())
                    .append("\nhabitaciones reservadas: ").append(data.getNumberOfRoomsForBooking())
                    .append("\n---------------------------------\n");
        }
        if (bookingRepository.getBookings().isEmpty()) {
            sb.append("No hay reservas registradas");
        }
        return sb.toString();
    }
}
