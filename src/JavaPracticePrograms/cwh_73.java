package JavaPracticePrograms;

class MyThr extends Thread{
    MyThr(String name){
    }
    public void run(){
        System.out.println("I am a Thread");
    }
}
class MyThr1 implements Runnable{
    MyThr1(String name){
    }
    public void run(){
        System.out.println("I am thread of runnable thread");
    }
}
public class cwh_73 {
    public static void main(String[] args) {
//        MyThr t = new MyThr("akeel");
//        t.start();
//        System.out.println("i am id of this thread " + t.getId());
//        System.out.println("i am name of this thread " + t.getName());
        MyThr1 t1 = new MyThr1("harry");
        Thread ch = new Thread(t1);
        ch.start();
        System.out.println(" I am id of this thread" + ch.getId());
        System.out.println(" I am name of this thread" + ch.getName());

    }
}
