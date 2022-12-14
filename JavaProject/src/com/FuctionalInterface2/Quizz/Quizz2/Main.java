package com.FuctionalInterface2.Quizz.Quizz2;

public class Main {


    /*
      2. Napisz interfejs funkcyjny z metodą, która przyjmie od Ciebie String, Integer oraz Dowolny obiekt.
    Typem zwracanym z takiej metody będzie Integer. Napisz 2 implementacje funkcyjne takiej metody:


    - Pierwsza ma zwracać sumę długości przekazanego Stringa, przekazanego Integera oraz długości
    Stringa zwróconego z wywołanej metody toString() na przekazanym ostatnim obiekcie do metody.


    -Druga ma dodać do siebie liczbę wystąpień litery 'a' w pierwszym Stringu, wartość przekazaną
            jako Integer oraz ilość wystąpień przecinków zsumowaną z ilością wystąpień '=' w metodzie
            toString() wywołanej na przekazanym ostatnim obiekcie.

     */

    public static void main(String[] args) {

        TriCustomFunction<Star> triCustomFunction = (str1, int1, star) -> {


            return str1.length() + int1 + star.toString().length();};

        Integer computed = triCustomFunction.compute("Frajda", 2022, new Star("Supernowy", "Komet"));
        System.out.println(computed);

        TriCustomFunction<Star> triCustomFunction2 = Main::getInteger;

        Integer computed2 = triCustomFunction2.compute("Frolik", 5000, new Star("Supernowa", "Lecąca"));
        System.out.println(computed);

    }

    private static Integer getInteger(String str1, Integer int1, Star star) {

        return countChars(str1, 'a') + int1 + (countChars(star.toString(), ',') + countChars(star.toString(), '='))  ;
    }

    private static Integer countChars(String str1, char c) {

        int sum = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == c) {

                sum++;
            }

        }


        return sum;

    }


    private static class Star {
        private final String name;
        private final String surname;

        public Star(String name, String surname) {

            this.name = name;
            this.surname = surname;
        }

        @Override
        public String toString() {
            return "Star{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }
}
