package com.MethodReference.MethodReference2;

public class MethodReferenceExample {

    public static void main(String[] args) {
        MilkProducer milkProducer = ()-> "some string";
        MilkConsumer milkConsumer = param1 -> "another string";
        System.out.println(milkProducer.produce());
        System.out.println(milkConsumer.consume("Consuming milk"));

        MilkProducer milkProducer2 = MethodReferenceExample::milkReference1;
        MilkConsumer milkConsumer2 = MethodReferenceExample::milkReference2;

        System.out.println(milkProducer2.produce());
        System.out.println(milkConsumer2.consume("Consuming milk"));


    }

    private static String milkReference1() {
        return "some string from Method";
    }

    private static String milkReference2(String arg2) {
        return "Another  string from Method: " + arg2;
    }


    interface MilkProducer {
        String produce();
    }

    interface MilkConsumer {
        String consume(String toConsume);
    }
}
