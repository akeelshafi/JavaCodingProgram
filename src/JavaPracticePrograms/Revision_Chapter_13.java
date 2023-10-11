package JavaPracticePrograms;
class myThread4 extends Thread{
    public void run(){
        int i =0;
        while (i<4000){
            System.out.println("I am cooking");
            System.out.println("i am chatting");
            i++;
        }
    }
}
class myThread8 extends Thread{
    public void run(){
        int i =0;
        while (i<4000){
            System.out.println("i am not cooking");
            System.out.println("i am not chatting");
            i++;
        }
    }
}
    class myThreadRunnable implements Runnable{
    public void  run(){
        int i =0;
        while (i<4000){
            System.out.println("i am a first runnable thread");
            System.out.println("i am  second runnable thread");
            i++;
        }
    }
    }
    class myThreadRunnable4 implements Runnable{
    public void run(){
        int i =0;
        while(i<4000){
            System.out.println("i am second first runnable thread");
            System.out.println("i am second second runnable thread");
            i++;
        }
    }
    }
public class Revision_Chapter_13 {
    public static void main(String[] args) {
   /*  myThread4 obj = new myThread4();
        myThread8 obj1 = new myThread8();
     obj.start();
     obj1.start();*/

        myThreadRunnable bullet1 = new myThreadRunnable();
        Thread gun1 = new Thread(bullet1);
        myThreadRunnable4 bullet2 = new myThreadRunnable4();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}
