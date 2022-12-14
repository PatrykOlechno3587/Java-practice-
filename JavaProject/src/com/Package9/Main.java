package com.Package9;

public class Main {

    public static void main(String[] args) {
        MilkProducer milkProducer = () -> "Produce some milk";
        MilkConsumer milkConsumer = argument1 -> {
            System.out.println("Calling consumer!");

            return argument1;
        };


        System.out.println(milkProducer.produce());
        System.out.println(milkConsumer.consume("Milk to consume with apetite"));

    }


}

@FunctionalInterface
interface MilkProducer {

    String produce();
}

@FunctionalInterface
interface MilkConsumer {

    String consume(String arg1);
}

