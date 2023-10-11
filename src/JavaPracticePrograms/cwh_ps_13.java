package JavaPracticePrograms;
class GoodMorning extends Thread{
    public void run(){
      //  while(true){
            System.out.println("Good Morning");

    }
}
class Welcome extends Thread{
    public void run(){
     //   while (true){
//              try {
//                  Thread.sleep(200);
//              }
//              catch (Exception e){
//                  System.out.println(e);
//              }
            System.out.println("Welcome");

    }
}
public class cwh_ps_13 {
    public static void main(String[] args) {
        // problem1
        GoodMorning t1 = new GoodMorning();
        Welcome t2 = new Welcome ();
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t2.getPriority());
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
        t1.start();
        t2.start();


    }
}
