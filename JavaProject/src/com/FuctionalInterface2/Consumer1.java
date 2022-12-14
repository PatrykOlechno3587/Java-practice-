package com.FuctionalInterface2;

import java.util.function.Consumer;

public class Consumer1 {

    public static void main(String[] args) {
        Consumer<String> consumerExample2 = str1 -> {
            if (str1.contains("TAN")) {
                return;
            }
            extracted(str1);
        };
        consumerExample2.accept("przekazujemy TYTANIK");
    }

    private static void extracted(String str1) {

        System.out.println(str1);
    }

}



