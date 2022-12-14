package com.FuctionalInterface2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Lublin");
        cities.add("Zakopane");
        cities.add("Toruń");

//        Predicate<String> predicate = p -> {
//            System.out.println("calling check for city: " + p);
//            return p.contains("L");
//        };
        print(cities, PredicateExample::stringTest);
    }


    private static boolean stringTest(String input) {
        System.out.println("calling check for city: " + input);
        return input.contains("L");
    }

    private static void print(final List<String> cities, Predicate<String> checker) {
        for (String city : cities) {
            if (checker.test(city))
                System.out.println("calling city : " + city);
        }

    }


}
