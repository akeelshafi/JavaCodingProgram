package JavaPracticePrograms;
class base {
    base() {
        System.out.println("I am a constructor");
    }
    base(int a) {
        System.out.println("I am an overloaded constructor of base with value of a as: " + a);
    }
}

class derived1 extends base{
    derived1(){
        super(5);
        System.out.println("I am a derived constructor");
    }
    derived1(int a,int b) {
        System.out.println("I am an overloaded constructor of derived with value of b as: " + b);

    }
}
class child extends derived1{
    child(){
        System.out.println("I am a child constructor");
    }
    child(int a, int b, int c){
        super(a,b);
        System.out.println("I am a overloaded constructor of child with value of c as: " + c);

    }
}
public class Cwh_Constructors_Inheritance {
    public static void main(String[] args) {
        //base b = new base();
      derived1 d1 = new derived1();
     // child ch = new child(8,15,10);
      // child ch = new child();


        
    }
}
