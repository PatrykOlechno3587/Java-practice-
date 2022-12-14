package com.FuctionalInterface2;

import java.util.function.UnaryOperator;

public class UnaryOperatorexample {

    public static void main(String[] args) {
        UnaryOperator<String> unary = UnaryOperatorexample::getString;
        System.out.println(unary.apply("String"));
    }

    private static String getString(String ptr) {
        System.out.println("Calling unary: " + ptr);

        return ptr;
    }

}
