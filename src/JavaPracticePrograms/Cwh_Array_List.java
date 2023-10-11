package JavaPracticePrograms;

import java.util.*;

public class Cwh_Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(5);
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(10);
        l2.add(20);
        l2.add(30);

        l1.add(1);
        l1.add(2);
        l1.add(30);
        l1.addAll(l2);
        for (int i=0;i< l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println(l1.contains(10));
        System.out.println(l1.size());
        l1.remove(2);
        System.out.println(l1);
        System.out.println(l1.indexOf(30));
        System.out.println(l1.lastIndexOf(30));


    }
}
