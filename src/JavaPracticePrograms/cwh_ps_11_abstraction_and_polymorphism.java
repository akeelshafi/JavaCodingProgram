package JavaPracticePrograms;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class FoundationPen extends pen{
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("refill...");
    }
    void changeNib(){
        System.out.println("Channing nib...");
    }
}

class Monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
}
abstract class TelPhone{
   abstract void ring();
   abstract void lift();
   abstract void disconnect();
}
class SmartTelPhone extends TelPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("lifting...");
    }
    public void disconnect(){
        System.out.println("disconnecting...");
    }
    public void callAkeel(){
        System.out.println("CALLING AKEEL...");
    }
}
class Monkey1{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }
}
interface BasicAnimal1{
    void eat();
    void sleep();
}
class Human1 extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
}
interface TvRemote{
    void buttonOn();
    void buttonOff();
}
interface SmartTvRemote extends TvRemote{
    void button1();
    void button2();
}
class Tv implements SmartTvRemote{
    public void buttonOn(){
        System.out.println("Switching Tv ON...");
    }
    public void buttonOff(){
        System.out.println("Switching Tv OFF...");
    }
    public void button1(){
        System.out.println("increase volume of TV...");
    }
    public void button2(){
        System.out.println("Decrease volume of Tv...");
    }
}

public class cwh_ps_11_abstraction_and_polymorphism {
    public static void main(String[] args) {
        // problem2
      /*  FoundationPen p = new FoundationPen();
        p.write();
        p.refill();
        p.changeNib();
*/
        // problem 3
       /* Human h = new Human();
        h.eat();
        h.bite();
        h.sleep();
        h.jump();*/

        // problem 4
       /* TelPhone th = new SmartTelPhone();
       // th.callAkeel(); --> error
        SmartTelPhone st = new SmartTelPhone();
        st.callAkeel();*/

        // problem 5
      /*  Monkey m = new Human();
        m.bite();
        m.jump();
       //  m.sleep(); -->error
        BasicAnimal b = new Human();
        b.eat();
        b.sleep();
      //  b.bite(); --> error
        Human hb = new Human();
        System.out.println("all class");
        hb.jump();
        hb.bite();
        hb.sleep();
        hb.eat();*/

        // problem 7
       /* Tv t = new Tv();
        t.buttonOn();
        t.buttonOff();
        t.button1();
        t.button2();*/
        TvRemote t = new Tv();
        t.buttonOn();
        t.buttonOff();
        // t.button1(); -->error




    }
}
