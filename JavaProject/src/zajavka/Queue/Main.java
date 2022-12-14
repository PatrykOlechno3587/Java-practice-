package zajavka.Queue;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 1, 1, 45, 23, 6, 9, 10, 20, 2);

        Deque<Integer> stack = new ArrayDeque<>();
        for (Integer element : input) {
            stack.push(element);
//            System.out.println(stack);
        }

                    System.out.println(stack);

        int size = stack.size();
        for (int i = 0; i < size ; i++) {
            System.out.println("stack.peek " + stack.peek());
            System.out.println(stack);

            System.out.println("stack.pop " + stack.pop());
            System.out.println(stack);


        }
        }
    }


