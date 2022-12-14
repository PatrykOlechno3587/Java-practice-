package com.MethodReference;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {

        DogPrinter dogPrinter = new DogPrinter();


        String someDog = Optional.of(new Dog("Burek"))
                .map(Dog::dajName)
                .orElse("anotherDogName");
        System.out.println(someDog);

        Optional.of(new Dog("Warczek"))
                .ifPresent(System.out::println);

        Optional.of(new Dog("Warczek"))
                .ifPresent(dogPrinter::printDoggy);
    }



}
