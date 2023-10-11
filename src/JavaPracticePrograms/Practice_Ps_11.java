package JavaPracticePrograms;

abstract class Pen2{
    abstract void write();
    abstract void refill();
}
class BallPen extends Pen2{
     public void write(){
        System.out.println("Writing...");
    }
    public void refill(){
        System.out.println("Refilling pen...");
    }
    public  void ChangeNib(){
        System.out.println("Changing nib of pen...");
    }
}

class Monkey2{
    public  void jump(){
        System.out.println("jumping...");
    }
    public void bite(){
        System.out.println("biting...");
    }
    interface Animal{
        void eat();
        void sleep();
    }
    class Human1 extends Monkey2 implements Animal{
       public void eat(){
           System.out.println("eating..");
        }
        public void sleep(){
            System.out.println("sleeping...");
        }
    }
}

abstract class TelePhone{
     abstract public void ring();
     abstract public void lift();
     abstract public void discount();
}
class SmartPhone extends TelePhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Lifting phone...");
    }
    public void discount(){
        System.out.println("discounting...");
    }
    public  void call(){
        System.out.println("recording video..");
    }
    public  void music(){
        System.out.println("Listing music...");
    }
}
interface tvRemote1{
    void on();
    void off();
}
class smartTvRemote1 implements tvRemote1{
    public void on(){
        System.out.println("Turning tv on...");
    }
    public void off(){
        System.out.println("Turning tv off...");
    }
}
class Tv1 implements tvRemote1{
public void on(){
    System.out.println("Turning tv on...");
    }
    public void off(){
        System.out.println("Turning tv off...");
    }
}
public class Practice_Ps_11 {
    public static void main(String[] args) {
        // problem 1 and 2
//        BallPen b = new BallPen();
//        b.write();
//        b.refill();
//        b.ChangeNib();

        // problem 3
//        Human1 h = new Human1();
//        h.eat();
//        h.sleep();
//        h.bite();
//        h.jump();

        // problem 4
//        SmartPhone s = new SmartPhone();
//        s.music();
//        s.call();

        // problem 5
        tvRemote1 MiRemote = new Tv1();
        MiRemote.on();
        MiRemote.off();







    }
}
