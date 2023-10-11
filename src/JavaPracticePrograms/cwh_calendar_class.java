package JavaPracticePrograms;

import java.util.Calendar;

public class cwh_calendar_class {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getWeeksInWeekYear());
        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar. DAY_OF_MONTH));

    }
}
