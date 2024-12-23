package org.example;


import org.example.utils.ScannerInitializer;

import java.util.Scanner;

import static org.example.services.booking.BookingImpl.menu;

/**
 * @author Manuel Aguilera
 */
public class Main {
    public static final Scanner input = ScannerInitializer.getInstance();

    public static void main(String[] args) {
        menu();
    }

}