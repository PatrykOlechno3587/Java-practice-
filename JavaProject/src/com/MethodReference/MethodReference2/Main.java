package com.MethodReference.MethodReference2;

public class Main {

    public static void main(String[] args) {
//        Yacht boat1 = model -> {printModel(model);};

        Yacht boat1 = Main::printModel;
        boat1.swim("Xelion");

    }

    private static void printModel(String model) {
        System.out.println("we are swimming on a " + model);

    }
     private static void printModel(int model, String type) {
        System.out.println("we are swimming on a " + model);

    }



}
