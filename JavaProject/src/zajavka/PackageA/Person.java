package zajavka.PackageA;

class Person implements Comparable<Person> {

    private final String name;
    private final City city;

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }


    public Person(String name, City city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
