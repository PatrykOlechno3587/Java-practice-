package zajavka.Functions;

import java.util.ArrayList;
import java.util.List;

public final  class Main {


    private final List<String> list;

    public Main(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return new ArrayList<>(list);
    }

    public int add(int a, int b ) {

        int c = a + b;
        return a + b;



    }


}
