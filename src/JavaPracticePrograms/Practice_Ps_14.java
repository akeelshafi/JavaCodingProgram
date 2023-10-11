package JavaPracticePrograms;

import java.util.Scanner;

public class Practice_Ps_14 {
    public static void main(String[] args) {
        // problem 1
        // int a = 9 -> syntax error
//        int a1 = 10, b1 =0;
//        int c1 = a1/b1;-> runtime error
        // problem 2
     /*   int a = 5;
        int b= 0;
        try {
            int c = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
            System.out.println(e);
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
            System.out.println(e);
        }*/
           // problem 3
        boolean flag = true;
        int[] marks ={7,56,40,64};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of index");
        int index;
        int i = 0;
        while (flag && i<5){
            try {
                index = sc.nextInt();
                System.out.println("The value of marks [index] is: " + marks[index]);
                break;

            }
            catch (Exception e){
                System.out.println("Enter correct index value");
                i++;
            }
        }
        if (i>=5){
            System.out.println("ERROR");
        }
    }

}
