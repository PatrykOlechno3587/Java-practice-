package com.ProjectwithInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Producer<T extends Comparable<T>> {

    public  Supplier<T> getSupplierImpl(T t ){

        return ()-> t ;
    }

    public Consumer<T> getConsumerImpl( ){

        return  p1 -> System.out.println(" zwraca jakiś string! " +  p1 );

    }

    public Function<T, T> getFunctionImpl(T t){

        return u -> u.toString().compareTo(t.toString()) > 0 ? t: u;
    }
}
