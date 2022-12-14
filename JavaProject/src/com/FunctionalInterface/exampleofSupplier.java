package com.FunctionalInterface;

import java.util.function.Supplier;

public class exampleofSupplier {

    public static void main(String[] args) {
        Supplier<Integer> supplierExample2 = exampleofSupplier::gimme;
        System.out.println(supplierExample2.get());
    }

    private static Integer gimme() {
        System.out.println();

        return 222;
    }
}
