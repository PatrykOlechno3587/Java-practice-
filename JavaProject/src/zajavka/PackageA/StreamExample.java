package zajavka.PackageA;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<String> stringStream = Stream.of("1", "7", "10")
                .peek(elem -> System.out.println("elem: " + elem));
//        stringStream.collect(Collectors.toList());
    }
}
