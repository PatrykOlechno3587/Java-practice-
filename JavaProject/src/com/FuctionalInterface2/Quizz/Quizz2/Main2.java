package com.FuctionalInterface2.Quizz.Quizz2;

import com.Package8.MyCustomException;

import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main2 {

    /*

            Napisz implementację interfejsu BinaryOperator, która z 2 przekazanych do niej obiektów zwróci
            większy. Jeżeli przekazane 2 obiekty są sobie równe, zwróć null, a potem obsłuż go wykorzystując
            Optional, który wyrzuci wyjątek, w przypadku gdy obiekty są sobie równe.


     */


    public static void main(String[] args) {
        BinaryOperator<Ocean> binaryOperatorImpl = (o1, o2) -> {
            int comparisonResult = o1.compareTo(o2);
            if (comparisonResult == 0) {
                return null;
            }
            return comparisonResult > 0 ? o1 : o2;
        };

        Ocean ocean = Optional.ofNullable(
                binaryOperatorImpl.apply(new Ocean(2), new Ocean(2)
                )).orElseThrow(  () -> new MyCustomException("Ma wyrzucić na czerwono gdy obiekty są równe!"));



        System.out.println(ocean);

    }

    private static class MyCustomException extends RuntimeException {
        public MyCustomException(String message) {
            super(message);
        }
    }
}


                class Ocean implements Comparable<Ocean> {
                    @Override
                            public String toString() {
                        return "Ocean{" +
                "numberOfFish=" + numberOfFish +
                '}';
                            }

                        private final int numberOfFish;

                public Ocean(int numberOfFish) {
                        this.numberOfFish = numberOfFish;
                }

    @Override
    public int compareTo(Ocean ocean) {
        return this.numberOfFish - ocean.numberOfFish;
    }
}

