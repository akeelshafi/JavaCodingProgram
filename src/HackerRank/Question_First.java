package HackerRank;
import java.util.*;
import java.text.*;

public class Question_First {
    public static void main(String[] args) throws Exception {
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Today's date:"+sdf.format(cal.getTime()));

        Format f = new SimpleDateFormat("EEEE");
        String str = f.format(new Date());
        System.out.println("Day Name: "+str);

    }
}
