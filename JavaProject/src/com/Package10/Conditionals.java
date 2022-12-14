package com.Package10;

public class Conditionals {


    public static void main(String[] args) {
        int a = 100;
        int b = -200;

        String result = a + b > 4 ? "a + b > 4 " : "a + b < 4";
        System.out.println(result);
        String string1b = someMethod1();
        System.out.println(string1b);

    }

    private static String someMethod1() {

        return "someMethod1";
    }

    private static String someMethod2() {

        return "someMethod2";
    }

    private static String someMethod3(int a, int b) {


        return a + b < 0 ? someMethod1(): someMethod2();
    }
}
