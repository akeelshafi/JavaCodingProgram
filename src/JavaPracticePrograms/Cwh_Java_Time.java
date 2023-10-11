package JavaPracticePrograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Cwh_Java_Time {
    public static void main(String[] args) {
//        LocalTime t = LocalTime.now();
//        System.out.println(t);
//
//        LocalDate d1 = LocalDate.now();
//        System.out.println(d1);


        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String MyDate = dt.format(df);
        System.out.println(MyDate);

    }
}
