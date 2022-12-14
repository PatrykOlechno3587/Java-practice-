package com.Package10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Streams {


    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("set pierwszy");
        stringSet.add("set drugi");
        stringSet.add("set trzeci");

        Stream<String> stream = stringSet.stream();



        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("set pierwszy", "someValue");
        stringMap.put("set drugi", "someValue");
        stringMap.put("set trzeci", "someValue");

        stringMap.entrySet().stream();
    }
}
