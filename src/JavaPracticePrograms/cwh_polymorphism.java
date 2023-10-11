package JavaPracticePrograms;

interface MyCamera2{
    void takePhoto();
    void takeVideo();
    void record4kVideo();
}
interface MyWifi2{
    void getNetwork();
}
class MyCellPhone2{
    void callNumber(){
        System.out.println("Calling a number...");
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2,MyWifi2{
    public void takePhoto(){
        System.out.println("Taking Photo...");
    }
    public void takeVideo(){
        System.out.println("Taking video...");
    }
    public void record4kVideo(){
        System.out.println("Recording 4k video...");
    }
    public void getNetwork(){
        System.out.println("Network available: ake4g..., ake55g...");
    }
}
public class cwh_polymorphism {
    public static void main(String[] args) {
        MyWifi2 wi = new MySmartPhone2();
        wi.getNetwork();
        // wi.takePhoto(); --> error
        MyCamera2 ch = new MySmartPhone2();
        ch.takePhoto();
        ch.takeVideo();
        ch.record4kVideo();

    }
}
