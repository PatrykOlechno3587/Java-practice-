package zajavka.Package2;

import java.util.LinkedList;
import java.util.List;

public class Example {

    public static void main(String[] args) {
            List<Integer> input  = List.of(5, 8, 78, 32, 23 ,45, 54, 72, 67);

            LinkedList<Integer> queue = new LinkedList<>();

        for (Integer element : input) {
            queue.offer(element);
//            System.out.println("queue offer: " + queue.offer(element) +  ", added element " + element);
//            System.out.println(queue);//
        }


        System.out.println(queue);
        queue.addFirst(50607080);
        queue.addLast(90807060);
        System.out.println(queue);


        }



        }






