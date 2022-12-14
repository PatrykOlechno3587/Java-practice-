package com.Package2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quizz {

    public static void main(String[] args) {


        List< String > list = Arrays.asList("Warszawa", "Zakopane",  "Augustów",  "Jelenia Górra" );
        Collections.sort(list, (e1, e2) -> e1. compareTo(e2));

        System.out.println(Collections.binarySearch(list, "Augustów"));

    }



}
