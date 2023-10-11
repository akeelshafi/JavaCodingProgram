package JavaPracticePrograms;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Cwh_Advance_Practice_set {
    public static void main(String[] args) {
        // Problem 1
        /*ArrayList<String> StudentName = new ArrayList<>(10);
        StudentName.add("Akeel shafi");
        StudentName.add("Furqan manzoor");
        StudentName.add("Samiullah ganai");
        StudentName.add("Abul ala ");
        StudentName.add("Sahil bilal");
        StudentName.add("Minzah jeelani");
        StudentName.add("Mahlikah nisar");
        StudentName.add("Mehak ayoub");
        StudentName.add("Saba jan");
        StudentName.add("Mehfooza hussani");
        StudentName.add("Rahila mazooor");
        StudentName.add("Munzah rather");

        for (int i=0;i<StudentName.size();i++){
            System.out.println(StudentName.get(i));
        }*/

        // problem 2
//        Date d = new Date();
//        System.out.println(d.getHours()+ ":" + d.getMinutes() + ":" +d.getSeconds());

        // problem 3
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":" + c.get(Calendar.MINUTE)+":" + c.get(Calendar.SECOND));

        // Problem 4
//        LocalDateTime d = LocalDateTime.now();
//        DateTimeFormatter dt = DateTimeFormatter.ofPattern("H:m:s");
//        String df = d.format(dt);
//        System.out.println(df);

        // problem 5

        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(4);
        h.add(1);

        System.out.println(h);
    }
}