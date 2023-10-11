package JavaPracticePrograms;

abstract class pen1{
    abstract void write();
    abstract  void refill();
}
class FoundationPen1 extends pen1{
    public void write(){
        System.out.println("Writing...");
    }
    public  void refill(){
        System.out.println("changing refill...");
    }
    public  void changeNib(){
        System.out.println("changing nib...");
    }
}
class  monkey4{
    public void jump(){
        System.out.println("jumping...");
    }
    public void bite(){
        System.out.println("biting...");
    }
}
  interface  basicAnimal{
    void eat();
    void  sleep();
 }
class  human4 extends monkey4 implements basicAnimal{
    public void eat(){
        System.out.println("eating...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
}
abstract class telephone4{
    abstract void ring();
   abstract void lift();
   abstract void disconnect();
}
class smartTelephone4 extends telephone4{
    public void ring(){
        System.out.println("ringing...");
    }
    public void lift(){
        System.out.println("lifting....");
    }
    public void disconnect(){
        System.out.println("disconnecting...");
    }
    public void wifiCalling(){
        System.out.println("wifi calling.....");
    }
}
interface tvRemote4{
    void volumeUp();
    void volumeDown();
    void on();
    void  off();
}
interface smartTvRemote4 extends tvRemote4{

}
class tv4 implements smartTvRemote4{
    public void volumeUp(){
        System.out.println("volumeUp...");
    }
    public void volumeDown(){
        System.out.println("volumeDown...");
    }
    public void on(){
        System.out.println("tv on...");
    }
    public void off(){
        System.out.println("turning tv on...");
    }
}
public class Revision_Chapter_11 {
    public static void main(String[] args) {
        // problem 1
  /*      //pen1 obj = new pen1();
        FoundationPen1 obj = new FoundationPen1();
        obj.write();
        obj.refill();
        obj.changeNib();
*/
        // problem 2
     /*   monkey4 obj = new human4();
        obj.jump();
        obj.bite();*/

        // problem 3
      /*  smartTelephone4 obj = new smartTelephone4();
        obj.disconnect();
        obj.ring();
        obj.lift();
        obj.wifiCalling();*/

        // problem 4
    /*    monkey4 obj = new human4();
        obj.jump();
        obj.bite();*/
      //  obj.eat(); cannot resolve

        // problem 5
        tv4 obj = new tv4();
        obj.off();
        obj.on();
        obj.volumeDown();
        obj.volumeUp();







    }
}
