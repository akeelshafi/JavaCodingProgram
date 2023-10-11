package JavaPracticePrograms;
import java.util.Scanner;
public class Cwh_Ps_04 {
    public static void main(String[] args) {
        // Question 1
//        int a = 10;
//        if (a=11){
//            System.out.println("I am 11");
//
//        }else {
//            System.out.println(" I am not 11");

        // Question
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of first subject");
        float subject1 = sc.nextFloat();
        System.out.println("Enter marks of second subject");
        float subject2 = sc.nextFloat();
        System.out.println("Enter Marks Of Third Subject");
        float subject3 = sc.nextFloat();
        float sum = subject1 + subject2 + subject3;
        float percentage = (sum/300*100);
        System.out.print("Percentage : ");
        System.out.println(percentage);
        if (percentage>=40.0f && subject1 >= 33.0f && subject2 >= 33.0f && subject3 >=  33.0f){
            System.out.println("Congratulations! You Have Passed The Exam!");
        }else {
            System.out.println("Better Luck Next Time!");
        }
*/

        // Question 3
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income in Lacks!");
        float tax = 0;
        float income = sc.nextFloat();
        if (income<=2.5f){
            tax = tax +0;

        } else if (income>2.5f && income <=5f) {
            tax = tax + 0.05f * (income - 2.5f);

        } else if (income>5f && income <=10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);

        } else if (income >10.0f) {
            tax = tax + 0.05f * (5.0f- 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10f);

        }
        System.out.println("Total income tax paid by an Employee is : " + tax);
*/
        // Question 4
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number!");
        int Day;
        Day = sc.nextInt();
        switch (Day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> {
            }
        }
        System.out.println("Enjoy Your Day!");

*/

        // Question 5
     /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter Website Name");
        String website = sc.next();
        if (website.endsWith(".com")){
            System.out.println("This is a Commercial Website!");
        } else if (website.endsWith(".org")) {
            System.out.println("This is a Organizational Website!");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian Website!");

        }
*/

        // Question 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = sc.nextInt();
        if (year==366) {
            System.out.println("This is leap ye");
        }




    }
}
