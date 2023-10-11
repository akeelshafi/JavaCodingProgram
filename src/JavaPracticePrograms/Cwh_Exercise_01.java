package JavaPracticePrograms;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Cwh_Exercise_01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks Of First Subject");
        float Subject1 = sc.nextFloat();
        System.out.println("Enter Marks of second Subject");
        float Subject2 = sc.nextFloat();
        System.out.println("Enter marks of third subject");
        float Subject3 = sc.nextFloat();
        System.out.println("Enter marks of Fourth subject");
        float Subject4 = sc.nextFloat();
        System.out.println("Enter marks of Fifth subject");
        float Subject5 = sc.nextFloat();

        float percentage =(Subject1 + Subject2 +Subject3 + Subject4 +Subject5)/500*100;
        System.out.print("Percentage = "+" ");
        System.out.println(percentage);




    }





}
