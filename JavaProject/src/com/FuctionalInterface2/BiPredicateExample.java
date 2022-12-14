package com.FuctionalInterface2;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        BiPredicate<String, Dog> biPredicate = someChecker();
        boolean dogResult = biPredicate.test("Dog", new Dog());
        System.out.println(dogResult);
    }

    private static BiPredicate<String, Dog> someChecker() {
        return (str, d) -> {
            System.out.println("Testing " + str + d);
            return d.toString().contains(str);

        };
    }

    static class Dog {

    }
}
