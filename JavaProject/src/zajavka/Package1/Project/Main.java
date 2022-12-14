package zajavka.Package1.Project;

import java.util.ArrayDeque;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CustomQueue<Person> queue = new CustomQueue<Person>(new ArrayDeque<>());

        List<String> commandList = List.of(
                "ADD PERSON(Tomasz_Romański)",
                "ADD PERSON(Rafał_Adamczuk)",
                "ADD PERSON(Tomasz_Romański)",
                "ADD PERSON(Mariusz_Wilczek)",
                "ADD PERSON(Zbigniew_Ratownik)",
                "PROCESS",
                "LEAVE PER,SON(Tomasz_Romański_2)",
                "LEAVE PERS,ON(Mariusz_Wilczek)",

                "PROCESS",
                "PROCESS",
                "PROCESS"
        );

        for (String command : commandList) {
            queue.processCommand(command);

        }
    }
}
