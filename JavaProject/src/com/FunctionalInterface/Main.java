package com.FunctionalInterface;

public class Main {

    public static void main(String[] args) {
        Traveller traveller = timer -> System.out.println(" Let us travel " + timer);//obojętnie jak się nazywa parametr
        traveller.travel("Going to Utopia");
    }
}
