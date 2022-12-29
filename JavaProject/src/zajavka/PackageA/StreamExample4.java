package zajavka.PackageA;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample4 {

    public static void main(String[] args) {



                Stream<String> stringStream = Stream.of("5", "10", "15", "20", "25")
                        .peek(elem -> System.out.println("elem: " + elem));


        Stream<Integer> peek1 = Stream.iterate(0, previous -> previous + 1)
                .peek(elem -> System.out.println("elem: " + elem));

        System.out.println(peek1);


    }
}
