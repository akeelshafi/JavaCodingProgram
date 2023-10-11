package JavaPracticePrograms;

import java.util.Scanner;

public class cwh_81 {
    public static void main(String[] args) {
        int Marks[] = {50, 60, 80};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index");
        int ind = sc.nextInt();
        System.out.println("Enter  the number you want to divide with");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index is: " + Marks[ind]);
            System.out.println("The value of array-value/number is: " + Marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occured!");
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index bond out of array exception occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }


    }
}
