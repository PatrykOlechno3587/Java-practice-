package com.ProjectwithInterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Transformer {
    public static <T, R extends Number> Function<T, R> getFunctionIMPL() {
        return  ( T t ) -> (R) Integer.valueOf(t.toString().length()) ;

    }


    public static<T extends Number> UnaryOperator<T> getUnaryOperatorIMPL() {
        return (T t) -> (T) Integer.valueOf(t.intValue() * 3);
    }
}
