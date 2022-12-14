package com.FuctionalInterface2.Quizz.Quizz2;

import java.util.function.BiFunction;

public class Bi2FunctionExample {

    public static void main(String[] args) {


        BiFunction<Integer, Double, String> biFunction = Bi2FunctionExample::getString;

        System.out.println(biFunction.apply(5, 5.5));

    }
    private static String getString(Integer age, Double digit) {
        System.out.println("First param " + age);
        System.out.println("second param " + digit);
        return "" + (age + digit);
    }


}
