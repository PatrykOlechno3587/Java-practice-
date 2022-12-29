package zajavka.PackageA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class StreamExample3 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(

                new Person("Michał", new City("Olsztyn")),
                new Person("Rafał", new City("Zak0pane")),
                new Person("Tomek", new City("Toruń")),
                new Person("Marek", new City("Ostróda")),
                new Person("Dominik", new City("Kielce"))
        );

            people.stream()
                    .peek(elem -> System.out.println("Step1: " + elem))
                    .sorted(Comparator.comparing(Person::getName))
                    .forEach(elem -> System.out.println("Step2: " + elem));


    }
}
