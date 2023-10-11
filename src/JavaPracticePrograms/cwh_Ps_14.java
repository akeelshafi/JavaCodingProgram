package JavaPracticePrograms;

import java.util.Scanner;

public class cwh_Ps_14 {
    public static void main(String[] args) {
        // problem 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
            System.out.println(e);
        }
        catch (IllegalArgumentException e){
            System.out.println("hehe");
            System.out.println(e);
        }

    }
}
