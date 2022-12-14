package zajavka.Package2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Maps {


    public static void main(String[] args) {
        Map<Cat, String> ourMap = new TreeMap<>();

        ourMap.put(new Cat("Mruczek"), "Ja");
        ourMap.put(new Cat("Misiek"), "Ja");
        ourMap.put(new Cat("Mruczek"), "Ja");
        ourMap.put(new Cat("Mruczek"), "Tytanic");
        ourMap.put(new Cat("Mruczek"), "Oceanik");
        ourMap.put(new Cat("Mruczek"), "Ty");
        System.out.println(ourMap);
    }
    private static class Cat implements Comparable<Cat>{
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            System.out.println("Calling equals...");
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Cat cat = (Cat) o;
            boolean returnValue = name != null ? name.equals(cat.name) : cat.name == null;
            System.out.println(returnValue);

            return returnValue;
        }

        @Override
        public int hashCode() {
            int hashValue = name != null ? name.hashCode() : 0;
            System.out.println("Calling hashcode..." + hashValue);
            return hashValue;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Cat cat) {
            System.out.println("Calling CompareTo...");
            return this.name.compareTo(cat.name);
        }
    }






}
