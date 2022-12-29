package zajavka.PackageA;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

    public static void main(String[] args) {
      String[] someChars = new String[]{"t", "o", " ",  "b", "ę",
              "d", "z", "i", "e", " ", "b", "a" , "r", "d", "z" , "o", " ",
              "d", "ł", "u", "g", "i", "e", " ",  "z", "d", "a", "n", "i", "e" };

      String result= " ";


        for (String someChar : someChars) {

            result += someChar;
            
        }
        System.out.println(result);

    }
}
