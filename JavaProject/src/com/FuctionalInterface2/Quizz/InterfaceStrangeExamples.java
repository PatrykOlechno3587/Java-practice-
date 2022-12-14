package com.FuctionalInterface2.Quizz;

import java.util.HashMap;
import java.util.Map;

public class InterfaceStrangeExamples {
    public static void main(String[] args) {




        Map<Integer, Cat> mapExample = new HashMap<>();
        mapExample.put(1, new Cat("kotek"));
        mapExample.put(2, new Cat("kotek2"));
        mapExample.put(3, new Cat("kotek3"));
        mapExample.put(4, new Cat("kotek4"));

        System.out.println(mapExample);
        mapExample.replaceAll((Integer key, Cat  value)-> new Cat( value + "changed"));
        System.out.println(mapExample);

    }

    static class Cat{
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
