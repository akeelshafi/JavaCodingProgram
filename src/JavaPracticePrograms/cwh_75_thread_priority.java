package JavaPracticePrograms;

class MyThr2 extends Thread{
    public void run(){
        System.out.println("I am thread2");
    }

}
class MyThr3 extends Thread{
    public void run(){
        System.out.println("I am thread3");
    }

}
class MyThr4 extends Thread{
    public void run(){
        System.out.println("I am thread4");
    }

}
public class cwh_75_thread_priority {
    public static void main(String[] args) {
      MyThr2 t2 = new MyThr2();
      MyThr3 t3 = new MyThr3();
      MyThr4 t4 = new MyThr4();
      t4.setPriority(Thread.MAX_PRIORITY);
      t2.setPriority(Thread.MIN_PRIORITY);
      t3.setPriority(Thread.NORM_PRIORITY);
        System.out.println("I am maximum priority" +t4.getPriority());
        System.out.println("I am minimum priority" +t2.getPriority());
        System.out.println("I am norm priority" +t3.getPriority());
      t2.start();
      t3.start();
      t4.start();
    }
}
