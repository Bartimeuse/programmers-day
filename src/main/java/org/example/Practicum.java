package org.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.util.Calendar.DAY_OF_YEAR;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¬ведите год:");
        System.out.println(calculationAnyDayYear(scanner.nextInt(), 256));
    }

    public static String calculationAnyDayYear(int year, int dayYear) {
        var calendar = new GregorianCalendar(year, Calendar.JANUARY, 1);
        calendar.add(DAY_OF_YEAR, dayYear - 1);
        return new SimpleDateFormat("dd.MM.yyy").format(calendar.getTime());
    }
}