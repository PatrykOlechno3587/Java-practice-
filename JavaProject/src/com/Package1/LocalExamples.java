package com.Package1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalExamples {

    public static void main(String[] args) {
        System.out.println("LocalDate: " + LocalDate.of(2022, Month.AUGUST, 16));
        System.out.println("LocalTime: " + LocalTime.of(20, 29));
        System.out.println("LocalTime: " + LocalTime.of(21, 40, 32));
        System.out.println("LocalTime: " + LocalTime.of(20, 20, 23,902));


        System.out.println("LocalDateTime" + LocalDateTime.of(
                LocalDate.of(2022, 8, 16),
                LocalTime.of(20, 29)
                )
        );


    }

}
