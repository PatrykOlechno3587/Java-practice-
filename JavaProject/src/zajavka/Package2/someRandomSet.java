package zajavka.Package2;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class someRandomSet {

    public static void main(String[] args) {
        Set<Dog> dogs = new HashSet<>();
        LocalTime before = LocalTime.now();
        for (int i = 0; i < 10000000; i++) {
            dogs.add(new Dog("dog1" + i / 45));
        }
        System.out.println("took " + Duration.between(before, LocalTime.now()).toMillis());
    }

    private static class Dog {

        private String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dog dog = (Dog) o;
            return name.equals(dog.name);
        }

        @Override
        public int hashCode() {
         return Objects.hash(name);


        }

        @Override
        public String toString() {
            return "Dog: " + name;


        }
    }


}

