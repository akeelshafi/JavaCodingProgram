package JavaPracticePrograms;

import java.util.ArrayDeque;

public class Cwh_Array_Deque {
    public static void main(String[] args) {

        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        ArrayDeque<Integer> l2 = new ArrayDeque<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
//        l1.addLast(1);
//        l1.addFirst(3);
        l1.removeLast();
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1);

        l2.add(10);
        l2.add(20);
        l2.add(30);
            System.out.println(l1.getFirst());
            System.out.println(l1.getLast());
//            System.out.println(l2.getFirst());
//            System.out.println(l2.getLast());




    }
}
