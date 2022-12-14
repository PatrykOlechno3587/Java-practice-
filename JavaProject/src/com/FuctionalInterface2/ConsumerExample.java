package com.FuctionalInterface2;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer1 = input -> {
            extracted(input);

            return;
        };


        consumer1.accept("Tartaria");
    }



    private static void extracted(String input) {
        System.out.println("calling accept");
        System.out.println(input);
    }
}
