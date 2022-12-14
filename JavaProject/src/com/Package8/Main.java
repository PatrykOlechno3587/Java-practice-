package com.Package8;

import java.util.function.Function;

public class Main {


    public static void main(String[] args) {


        Function<Integer, String> integerStringFunction = i -> {


            if (i > 9) {
                throw new MyCustomException(i + "Greater than 0!");
            } else {
                return i.toString();
            }
        };
        System.out.println(integerStringFunction.apply(9));
    }
}
