package com.FuctionalInterface2;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {

            Screamer screamer = new Screamer();

        BiFunction<Tree, Bus, String> function = screamer::concat;
        System.out.println(function.apply(new Tree(), new Bus()));
    }
    static class Tree {
    }

    static class Bus {
    }


    static class Screamer {
        String concat(Tree te, Bus bs) {
            return te.toString()
                    .concat("-------")
                    .concat(bs.toString());
        }




    }

}
