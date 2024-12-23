package org.example.factory;


import org.example.model.Lodging;


import java.time.LocalDate;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public abstract class LodgingFactory {
    public abstract Lodging createLodging(String name, String city, float rating, LocalDate startDate, LocalDate endDate);

    //Aqui podemos definir metodos propios en comun
}
