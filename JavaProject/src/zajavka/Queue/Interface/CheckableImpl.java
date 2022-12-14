package zajavka.Queue.Interface;

public class CheckableImpl implements Checkable{
    @Override
    public boolean myTester(String value, Integer value1, String input) {
        System.out.println("CheckableImpl calling");
        return value.contains("JAVA");
    }
}
