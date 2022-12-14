package com.FuctionalInterface2.Quizz;

import java.util.function.BiConsumer;

public class BiConsumerExample2 {

    public static void main(String[] args) {
        BiConsumer<String, Elephant> biConsumer = (str, Tr) ->
        {
            System.out.println("Elephant  is tall" );
        };
        biConsumer.accept("New elephant " , new Elephant());

    }


    static class Elephant {


    }
}
