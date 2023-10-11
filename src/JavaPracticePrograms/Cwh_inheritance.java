package JavaPracticePrograms;

/**
 * @author Akeel shafi(CodeWithAkeel)
 */





class animal{
    private int ears;
    private int legs;
    private int tail;
    private int eyes;
//
//    public animal(int ears, int legs, int tail, int eyes) {
//        this.ears = ears;
//        this.legs = legs;
//        this.tail = tail;
//        this.eyes = eyes;
//    }

    public int getEars() {
        return ears;
    }

    public void setEars(int ears) {
        this.ears = ears;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}

class Derived extends animal{
    private String bark;
    private String run;

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }
}
public class Cwh_inheritance {
    public static void main(String[] args) {
        animal a = new animal();
        System.out.println(" i am a parent class");
        a.setEyes(2);
        a.setEars(2);
        a.setLegs(4);
        a.setTail(1);
        System.out.println("I have " + a.getEyes() +" eyes");
        System.out.println("I have " + a.getEars() +" Ears");
        System.out.println("I have " + a.getLegs() +" legs");
        System.out.println("I have " + a.getTail() +" tail");

        Derived d = new Derived();
        System.out.println("i am Derived class");
        d.setBark("i bark on people...");
        d.setRun("i am running fast...");
        System.out.println(d.getBark());
        System.out.println(d.getRun());
        d.setEyes(2);
        System.out.println(d.getEyes());


    }
}
