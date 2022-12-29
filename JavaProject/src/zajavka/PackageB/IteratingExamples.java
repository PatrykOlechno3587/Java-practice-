package zajavka.PackageB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingExamples {

    public static void main(String[] args) {
        List<String> listWithCities = new ArrayList<>();
//        listWithCities.add("Poznań");
//        listWithCities.add("Gostyń");
//        listWithCities.add("Katowice");
//        listWithCities.add("Radom");
//        listWithCities.add("Bydgoszcz");
//        listWithCities.add("Toruń");
        System.out.println(listWithCities.iterator().next());


        Iterator<String> iterator = listWithCities.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
