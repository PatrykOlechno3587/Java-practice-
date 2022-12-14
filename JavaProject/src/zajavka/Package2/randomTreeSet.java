package zajavka.Package2;

import java.util.*;

public class randomTreeSet {

    public static void main(String[] args) {

        Set<Mouse> mice = new TreeSet<>((o1, o2) -> o1.name.compareTo(o2.name));
        mice.add(new Mouse("Tarzan"));
        mice.add(new Mouse("Fryfon"));
        mice.add(new Mouse("Gryfon"));
        mice.add(new Mouse("Tomasz"));
        mice.add(new Mouse("Walek"));
        mice.add(new Mouse("Artek"));
        System.out.println(mice);




    }

    private static class Mouse{

        private String name;

        public Mouse(String name) {
            this.name = name;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Mouse mouse = (Mouse) o;
            return Objects.equals(name, mouse.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);


        }

        @Override
        public String toString() {
            return "Mouse: " + name;


        }
    }
}
