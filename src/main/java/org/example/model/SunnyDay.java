package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class SunnyDay extends Lodging {

    List<Activities> activities;

    public SunnyDay() {
        super();
        this.activities = new ArrayList<>();
    }

    public SunnyDay(String name, String category, String city, Float rating, LocalDate startDateAvailable, LocalDate endDateAvailable) {
        super(name, category, city, rating, startDateAvailable, endDateAvailable);
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activities activity) {
        activities.add(activity);
    }


    public List<Activities> getActivities() {
        return activities;
    }

    @Override
    public void getDetails() {
        System.out.printf("\nDia de sol: %s\nCiudad: %s\nCalificacion: %s\nActividades\n %s", getName(), getCity(), getRating(), getActivities().toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        if (!activities.isEmpty()) {
            for (Activities activity : activities) {
                sb.append(activity.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public static class Activities {
        private String name;
        private String description;

        public Activities(){
            this.name = "Actividad sin nombre";
            this.description = "Descripcion no proporcionada";
        }

        public Activities(String name, String description) {
            this.name = name;
            this.description = description;
        }


        @Override
        public String toString(){
            return String.format("Actividad: %s\nDescripción: %s", name, description);
        }
    }
}
