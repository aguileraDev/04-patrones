package org.example.utils;

import java.util.Scanner;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public class ScannerInitializer {

    public static final Scanner INSTANCE = new Scanner(System.in);

    private ScannerInitializer() {
    }

    public static synchronized Scanner getInstance() {
        return INSTANCE;
    }
}

