package com.ProjectwithInterface;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    /*

             Utwórz klasę Transformer, która będzie w stanie zwrócić implementacje interfejsów funkcyjnych
            (Function, UnaryOperator), które pozwolą nam transformować dane w metodach .map(), które są dostępne
            w klasie Optional.

              Na koniec stwórz klasę MyConsumer, która zdefiniuje metody, będące w stanie przyjąć jako argumenty
                interfejsy funkcyjne takie jak: Consumer, Supplier oraz Function, a następnie wydrukować na ekranie
                    wartości zwrócone przez metody wywołane na tych interfejsach funkcyjnych.


     */

    public static void main(String[] args) {

    MyConsumer myConsumer = new MyConsumer();
    myConsumer.comsumeConsumer(
            s-> { System.out.println(s); });

//
//        myConsumer.comsumeSupplier(() -> "345");
//
//
//        myConsumer.comsumeFunction(t -> t.toString());

//        -----------------------------------------------------------------
//        Function<String, Integer> myFunction = Transformer.getFunctionIMPL();
//
//        Optional<Integer> myOptional = Optional.of("myOptional").map(myFunction);
//        System.out.println(myOptional);
//
//
//        UnaryOperator<BigDecimal> myUnaryOperator = Transformer.getUnaryOperatorIMPL();
//        Optional<BigDecimal> myUnaryOperator1 = Optional.of(BigDecimal.valueOf(5.15)).map(myUnaryOperator);
//        System.out.println(myUnaryOperator1);

//        -----------------------------------------------------------------
//        Producer<String> myProducer = new Producer<>();
//        Supplier<String> mySupplier = myProducer.getSupplierImpl("Podajemy Stringa jako parametr");
//        System.out.println(mySupplier.get());
//
//        Consumer<String> myConsumer = myProducer.getConsumerImpl();
//        myConsumer.accept("My string!");
//
//        Function<String,String> myFunction = myProducer.getFunctionImpl("y");
//        System.out.println(myFunction.apply("w"));


    }
}
