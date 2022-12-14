package com.PackageDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExamples {

    public static void main(String[] args) {
        System.out.println("LocalDate.now: " + LocalDate.of(2022, 10, 21));
        System.out.println("LocalDate.now: " + LocalDate.of(202, Month.OCTOBER, 2));

       System.out.println("LocalTime.now: " + LocalTime.of(12, 30, 34, 34));
        System.out.println("LocalTime.now: " + LocalTime.of(15, 20, 15));
        System.out.println("LocalTime.now: " + LocalTime.of(16,38));





        System.out.println(Month.OCTOBER.equals(Month.OCTOBER));


    }
}
