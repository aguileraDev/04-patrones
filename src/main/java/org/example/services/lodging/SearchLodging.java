package org.example.services.lodging;

import org.example.factory.initializer.LodgingInitializer;
import org.example.model.Lodging;
import org.example.repository.LodgingRepository;
import org.example.services.interfaces.ICommand;
import org.example.utils.ConsoleUtil;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class SearchLodging implements ICommand<List<Lodging>> {
    private LodgingRepository lodgingRepository;

    public SearchLodging(){
        this.lodgingRepository = LodgingRepository.getInstance();
    }

    @Override
    public List<Lodging> execute() {
        String city = ConsoleUtil.captureString("Ingrese la ciudad deseada: ");
        String category = ConsoleUtil.captureString("Ingrese el tipo del alojamiento deseado(Hotel, Apartamento, Finca, Dia de sol): ");
        LocalDate entryDay = ConsoleUtil.captureDate("Ingrese la fecha de inicio de la estadia (yyyy-mm-dd): ");
        LocalDate endDay = ConsoleUtil.captureDate("Ingrese la fecha del fin de la estadia (yyyy-mm-dd): ");
        Byte adults = ConsoleUtil.captureByte("Ingrese la cantidad de adultos: ");
        Byte children = ConsoleUtil.captureByte("Ingrese la cantidad de niños: ");
        Integer rooms = ConsoleUtil.captureInteger("Ingresa la cantidad de habitaciones que necesitas: ");
        Lodging lodging = LodgingInitializer.initializeLodging("Generico",category,city,4.5F, entryDay, endDay);

        List<Lodging> availableLodgings = searchLodging(lodging, children, adults, rooms);

        return availableLodgings;

    }


    public List<Lodging> searchLodging(Lodging lodgingData, Byte children, Byte adults, Integer numberOfRooms) {
        return lodgingRepository.getLodgings().stream()
                .filter(lodging -> matchCategory(lodging, lodgingData)
                        && hasRoomAvailability(lodging, numberOfRooms)
                        && hasAdultCapacity(lodging, adults)
                        && hasChildCapacity(lodging, children)
                        && isWithinDateRange(lodging, lodgingData))
                .collect(Collectors.toList());
    }

    public static Boolean matchCategory(Lodging lodging, Lodging lodgingData) {
        return lodging.getCategory().equals(lodgingData.getCategory());
    }
    public static Boolean hasRoomAvailability(Lodging lodging, Integer numberOfRooms) {
        return lodging.getRooms().stream().anyMatch(room -> room.getAvaibility() >= numberOfRooms);
    }

    public static Boolean hasAdultCapacity(Lodging lodging, Byte adults) {
        return lodging.getRooms().stream().anyMatch(room -> room.getAdultCapacity() >= adults);
    }

    public static Boolean hasChildCapacity(Lodging lodging, Byte children) {
        return lodging.getRooms().stream().anyMatch(room -> room.getChildCapacity() >= children);
    }

    public static Boolean isWithinDateRange(Lodging lodging, Lodging lodgingData) {
        return !lodging.getStartDateAvailable().isAfter(lodgingData.getStartDateAvailable()) &&
                !lodging.getEndDateAvailable().isBefore(lodgingData.getEndDateAvailable());
    }
}
