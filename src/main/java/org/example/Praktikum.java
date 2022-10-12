package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.util.Calendar.DAY_OF_YEAR;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите год:");
        var calendar = new GregorianCalendar(scanner.nextInt(), Calendar.JANUARY, 1);
        calendar.add(DAY_OF_YEAR, 255);
        System.out.println(calendar.getTime());
        }
    }

//    public static boolean isLeapYear(int year) {
//        Date date = new Date(1);
//    }
