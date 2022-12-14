package com.FuctionalInterface2.Quizz;

import java.util.function.BiPredicate;

public class BiPredicateExample2 {

    public static void main(String[] args) {
        BiPredicate<String, Aircraft> biPredicate2 = BiPredicateExample2::someChecker;
        boolean boeing = biPredicate2.test("Aircraft", new Aircraft());
        System.out.println(boeing);

    }

    private static boolean someChecker(String s1, Aircraft a1 ) {
            System.out.println("Testing : " + a1 + ", aircraft: " + s1);
            return a1.toString().contains(s1);

    }


    static class Aircraft {


    }

}
