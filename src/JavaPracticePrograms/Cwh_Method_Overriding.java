package JavaPracticePrograms;
class A{
    public void meth(){
        System.out.println("I am method 1 of class A");
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    public void meth(){
        System.out.println("I am method 1 of class B");
    }
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
}
public class Cwh_Method_Overriding {
    public static void main(String[] args) {
     A a = new A();
        a.meth();
        B b = new B();
        b.meth();
    }
}
