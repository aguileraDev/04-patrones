package org.example.services.lodging;

import org.example.model.Booking;
import org.example.model.Lodging;
import org.example.repository.LodgingRepository;
import org.example.services.interfaces.ILodging;
import org.example.utils.ConsoleUtil;

import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class LodgingImpl implements ILodging {
    private LodgingRepository lodgingRepository;
    private SearchLodging searchLodging;

    public LodgingImpl(SearchLodging searchLodging){
        this.lodgingRepository = LodgingRepository.getInstance();
        this.searchLodging = searchLodging;
    }


    @Override
    public void searchLodging() {
        List<Lodging> lodgings = searchLodging.execute();
        System.out.println("Alojamientos disponibles");
        lodgings.stream().forEach(lodging -> lodging.getDetails());

    }

    public Lodging findLodgingByName(String name) {
        return LodgingRepository.getInstance().getLodgings().stream()
                .filter(lodging -> lodging.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }


    private boolean shouldUpdateLodging() {
        String response = ConsoleUtil.captureString("¿Desea cambiar el alojamiento? (s/n): ");
        return response.equalsIgnoreCase("s");
    }

    private void updateLodging(Booking existingBooking) {
        String lodgingName = ConsoleUtil.captureString("Ingrese el nombre del nuevo alojamiento: ");
        Lodging newLodging = findLodgingByName(lodgingName);

        if (newLodging != null) {
            existingBooking.setLodging(newLodging);
            System.out.println("Alojamiento actualizado.");
        } else {
            System.out.println("No se encontro el alojamiento.");
        }
    }

    public void printAvailableLodgings(List<Lodging> lodgings) {
        if (lodgings.isEmpty()) {
            System.out.println("No se encontraron alojamientos disponibles");
        } else {
            System.out.println("------- Alojamientos disponibles --------");
            for (int i = 0; i < lodgings.size(); i++) {
                System.out.printf("Opcion %d:%n%s%n", i + 1, lodgings.get(i).toString());
            }
        }
    }
}
