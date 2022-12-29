package zajavka.PackageA;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<String> stringStream = Stream.of("3", "5", "20")
                .peek(elem -> System.out.println("elem: " + elem));


        List<String> stringList = List.of("3", "5", "20", "30", "60");

//
//        Stream<String> stream1 = stringList.stream()
//        .peek(elem -> System.out.println("elem: " + elem));


        Stream<String> stream2 = stringList.stream()
                .peek(elem -> System.out.println("elem2: " + elem));

//        stream1.collect(Collectors.toList());
        stream2.collect(Collectors.toList());

    }

}

