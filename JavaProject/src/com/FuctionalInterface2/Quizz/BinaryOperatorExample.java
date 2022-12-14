package com.FuctionalInterface2.Quizz;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {


    BiFunction<String, String, String> binaryOperator = String::concat;
   BinaryOperator<String> binaryOperator2 = String::concat;
}


