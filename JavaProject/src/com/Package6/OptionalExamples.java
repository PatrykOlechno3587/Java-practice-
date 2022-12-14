package com.Package6;

import java.util.List;
import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {

        List<String> list = List.of("Toruń", "Paryż", "Bukareszt", "Wiedeń");
        Optional<String> found = find(list, Optional.of("Brasil"));
        System.out.println(found);


    }

    private static Optional<String> find(List<String> countries,Optional<String> element) {

        for (String country : countries) {
            if (element.get().equals(country)) {
                return Optional.of(country);
            }


        }

        return Optional.empty();
    }
}
