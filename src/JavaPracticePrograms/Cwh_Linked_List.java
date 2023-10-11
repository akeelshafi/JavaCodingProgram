package JavaPracticePrograms;

import java.util.LinkedList;

public class Cwh_Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);

        l2.add(10);
        l2.add(20);
        l2.add(30);
        l1.addFirst(999);
       l1.addLast(666);
        l1.addAll(l2);
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }





    }

}
