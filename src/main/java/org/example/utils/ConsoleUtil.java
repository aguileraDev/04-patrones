package org.example.utils;

import java.time.LocalDate;

import static org.example.Main.input;
/**
 * @author Manuel Aguilera / @aguileradev
 */
public class ConsoleUtil {

    public static String captureString(String message) {
        System.out.println(message);
        return input.nextLine();
    }

    public static LocalDate captureDate(String message) {
        System.out.println(message);
        return LocalDate.parse(input.nextLine());
    }

    public static Byte captureByte(String message) {
        System.out.println(message);
        return input.nextByte();
    }

    public static Integer captureInteger(String message) {
        System.out.println(message);
        Integer value = input.nextInt();
        return value;
    }

    public static String captureStringWithNextLineClear(String message) {
        System.out.println(message);
        input.nextLine();
        return input.nextLine();
    }
}
