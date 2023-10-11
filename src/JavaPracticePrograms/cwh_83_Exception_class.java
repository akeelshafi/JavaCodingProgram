package JavaPracticePrograms;
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return " I am to string";
    }
    @Override
    public String getMessage() {
        return "I am get message ";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater then 120 for applying passport";
    }

    @Override
    public String getMessage() {
        return "Age cannot be a string";
    }
}
public class cwh_83_Exception_class {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
        if (age > 120) {
            try {
                throw new MaxAgeException();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("you can apply for passport");
        }
    }
}

