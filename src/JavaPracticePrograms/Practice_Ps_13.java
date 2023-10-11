package JavaPracticePrograms;
class goodMorning4 extends Thread{
    public goodMorning4(String name){
    }
    public void run(){
      //  while(true){
            System.out.println("I am thread one");
     //   }
    }
}
class welcome2 extends Thread{
   public welcome2(String name){
   }
    public void run() {
       // while (true) {
//            try {
//                Thread.sleep(200);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
            System.out.println("i am thread two");
      //  }
    }
}
class Greet extends Thread{
    public void run(){
      //  while (true){
            System.out.println("i am thread three");
      //  }
    }
}
class runnableThread3 implements Runnable{
    public void run(){
        while (true){
            System.out.println("I am runnable thread");
        }

    }
}
class akeel implements Runnable{
    public void run(){
        while (true) {
            try {
                Thread.sleep(50);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("i am second runable thread");
        }


    }
}

public class Practice_Ps_13 {
    public static void main(String[] args) {
        // problem 1
  goodMorning4 t1 = new goodMorning4("akeel");
  welcome2 t2 = new welcome2("harry");
//  Greet t3 = new Greet();
//  t1.setPriority(Thread.MIN_PRIORITY);
//  t2.setPriority(Thread.NORM_PRIORITY);
//  t3.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("The priority of thread one is MIN: " + t1.getPriority());
//        System.out.println("The priority of thread two is NORM: " + t2.getPriority());
//        System.out.println("The priority of thread three is MAX: " + t3.getPriority());
        t1.start();
        t2.start();
//        System.out.println("The state of thread one is: " + t1.getState());
//        System.out.println( "The state of thread two is: " +t2.getState());
//        System.out.println("The state of thread three is: " + t3.getState());
//        System.out.println(Thread.currentThread().getState());


//        runnableThread3 bullet1 = new runnableThread3();
//        Thread gun1 = new Thread(bullet1);
//        akeel bullet2 = new akeel();
//        Thread gun2 = new Thread(bullet2);
//        gun1.start();
//        gun2.start();

    }
}
