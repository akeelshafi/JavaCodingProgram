package JavaPracticePrograms;
abstract class phone{
    abstract void on();
    abstract void switchOff();
}
abstract class mediaPlayer{
    abstract void music();
}
class smartphone extends phone{
    void on(){
        System.out.println("Turning on...");
    }
    void switchOff(){
        System.out.println("Turning off...");
    }
    void music(){
        System.out.println("Playing music...");
    }
}
public class Cwh_Abstract {
    public static void main(String[] args) {
        phone obj = new smartphone();
        obj.on();
        obj.switchOff();
    }

}
