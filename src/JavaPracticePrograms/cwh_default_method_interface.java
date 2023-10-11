package JavaPracticePrograms;

interface MyCamera{
    void takePhoto();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("Recording video in 4K...");
    }
}
interface MyWifi{
    void getNetwork();
}
class MyCellPhone{
    void callNumber(){
        System.out.println("calling...");
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{
    public void takePhoto(){
        System.out.println("Taking Photo...");
    }
    public void recordVideo(){
        System.out.println("Recording video...");
    }
    public void record4kVideo(){
        System.out.println("Recording video in 4K... and sending to ake");
    }
    public void getNetwork(){
        System.out.println("Network available: Akeel4g, Akeel5g");
    }
    public void callNumber(){
        System.out.println("Calling......");
    }
    public void pickCall(){
        System.out.println("Connecting.....");
    }
}
public class cwh_default_method_interface {
    public static void main(String[] args) {
        MySmartPhone iphone = new MySmartPhone();
        iphone.callNumber();
        iphone.pickCall();
        iphone.getNetwork();
        iphone.record4kVideo();
        iphone.recordVideo();
        iphone.takePhoto();

    }
}
