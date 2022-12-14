package zajavka.Queue.Interface;

public class Main {

    public static void main(String[] args) {
//        Checkable checkablePrevious = new CheckableImpl();
//        System.out.println(checkablePrevious.myTester("Value"));

        Checkable checkable = (String SomeValue, Integer arg1, String arg2) -> {
            System.out.println("calling lambda");
            return arg2.contains("Zygfryd");

        };
        System.out.println(checkable.myTester("Wieża", 4, ""));



    }


}
