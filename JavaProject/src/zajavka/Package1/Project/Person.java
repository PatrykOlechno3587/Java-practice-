package zajavka.Package1.Project;

public class Person {

    private final String name;
    private final String surname;
    private final Integer counter;
    private final String id;


    public Person(String name, String surname, Integer counter, String id) {
        this.name = name;
        this.surname = surname;
        this.counter = counter;
        this.id = generateId();
    }

    private String generateId() {

        return String.format("%s_%s_$s", this.name, this.surname, this.counter);
    }

    @Override
    public String toString() {
        return  id ;
    }
}
