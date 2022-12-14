package zajavka.InterfacePROJECT;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        quiz();


    }

    private static void quiz() {
        List<String> list = new ArrayList<>();
        list.add("Gdansk");
        list.add("Łódź");
        list.add("Wrocław");
        list.removeIf(s -> s.contains("a"));

        System.out.println(list);
    }


}
