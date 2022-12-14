package zajavka.Package1.Project;

import java.util.Deque;

public class CustomQueue<T> {

    private final Deque<T> queue;

    public CustomQueue(Deque<T> queue) {
        this.queue = queue;
    }

    public void processCommand(String command) {
//    "ADD PERSON(Tomasz_Romański)",
//    "LEAVE PERSON(Tomasz_Romański_2)",
//   "PROCESS",

        if (command.contains("ADD PERSON")) {
            handleAddPerson(command);
        } else if (command.contains("LEAVE PERSON")) {
            handleLeavePerson(command);
        } else if (command.contains("PROCESS")) {
            handleProcess(command);
        } else {
            throw new RuntimeException("O co ci chodzi z tą komendą?: " + command);

        }
    }

    private void handleProcess(String command) {
    }
    private void handleLeavePerson(String command) {

    }
    private void handleAddPerson(String command) {
        String[] split = command
                .replace("ADD PERSON(", "")
                .replace(")", "")
                .split("_");

        if (split.length == 2) {
            String name = split[0];
            String surname = split[1];
            System.out.println(name + "" + surname);

        }

    }
}
