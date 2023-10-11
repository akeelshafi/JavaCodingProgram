package JavaPracticePrograms;

import java.util.Scanner;

public class cwh_82_nested_catch {
    public static void main(String[] args) {
        int Marks[] = {60,90,40};
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("Enter value of index");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video no.82");
                try {
                    System.out.println(Marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry,this index does not exist");
                    System.out.println("Exception in level two!");
                }
            }
            catch (Exception e){
                System.out.println("Exception in level1");
            }

        }
        System.out.println("End of program!");

    }
}
