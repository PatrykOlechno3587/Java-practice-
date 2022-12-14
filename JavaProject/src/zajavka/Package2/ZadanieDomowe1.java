package zajavka.Package2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ZadanieDomowe1 {

    public static void main(String[] args) {
        List<String> newPeopleList = List.of(
                " Marek Mirosław  +48989576432 ",
                " Michał  Lutnia +48989576432 ",
                " Olek Padamski +48989576432 ",
                " Tomasz Turowski +489576432 "
        );

        List<Person> peopleList1 = new ArrayList<>();

        for (String input : newPeopleList) {

            peopleList1.add(new Person(input));

        }
        Map<String, List<Person>> phoneBook = new TreeMap<>();

        for (Person person : peopleList1) {


        }

    }
}
