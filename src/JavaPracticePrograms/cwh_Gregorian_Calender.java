package JavaPracticePrograms;

import java.util.GregorianCalendar;

public class cwh_Gregorian_Calender {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2023));
        System.out.println(cal.hashCode());
        System.out.println(cal.getTime());
    }
}
