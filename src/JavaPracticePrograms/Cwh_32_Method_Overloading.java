package JavaPracticePrograms;

public class Cwh_32_Method_Overloading {
    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " Bro ");

    }
    static void foo(int a, int b){
        System.out.println("Good Morning "  + a + " Bro!");
        System.out.println("Good Morning "  + b + " Bro!");

    }

    public static void main(String[] args) {
        foo();
        foo(3000);
        foo(2000,3000);

    }
}
