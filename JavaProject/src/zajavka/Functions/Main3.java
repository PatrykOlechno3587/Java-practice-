package zajavka.Functions;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {


        Cat cat = new Cat("Tytusik");

//        Field[] fields = cat.getClass().getDeclaredFields();
        Method[] methods = cat.getClass().getMethods();
        System.out.println(methods[1].invoke(cat));
//        System.out.println(Arrays.toString(fields));



//        SomeInterface someInterface= someStaticMethod(arg-> System.out.println(arg));
//        someInterface.someMethod("Test1");
//    }
//    static SomeInterface someStaticMethod(SomeInterface function){
//        function.someMethod("Another string");
//
//
//    return otherInput ->
//        System.out.println("returned : " + otherInput);
//    } ;
//
//
//
//    @FunctionalInterface
//    interface SomeInterface {
//
//        void someMethod(String arg);
//
   }

    static class Cat{
        private final String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
