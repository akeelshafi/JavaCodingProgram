package JavaPracticePrograms;

interface gear{
    void gearUp();
    void gearDown();
}
interface bicycle{
    void speedUp(int increment);
    void speedDown(int decrement);
}

class heroCycle implements bicycle,gear{
    public void speedUp(int increment){
        System.out.println("Increase speed..................");
    }
    public void speedDown(int decrement){
        System.out.println("Decrease Speed............");
    }
    public void gearUp(){
        System.out.println("gearing up..............................");
    }
    public void gearDown(){
        System.out.println("Gearing down..............");
    }
}
public class cwh_interfaces {
    public static void main(String[] args) {
        heroCycle hc = new heroCycle();
        hc.speedUp(10);
        hc.speedDown(5);
        hc.gearUp();
        hc.gearDown();

    }
}
