package JavaPracticePrograms;
class MyThread1 extends Thread{
     public void run() {
         int i = 0;

         while (i<3000) {
             System.out.println("I am cooking");
             i++;
         }

     }
}

class MyThread2 extends Thread{
    public void run() {
        int i = 0;

        while (i<3000) {
            System.out.println("I am chatting");
            i++;
        }

    }
}

class MyThread3 extends Thread{
    public void run() {
        int i = 0;

        while (i<3000) {
            System.out.println("I am watching youtube video");
            i++;
        }

    }
}


public class cwh_70_threads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        t1.start();
        t2.start();
        t3.start();


    }
}
