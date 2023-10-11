package JavaPracticePrograms;
 class Employee{
     int salary;
     String name;

     public int getSalary(){
         return salary;
     }
     public String getName(){
         return name;
     }
     public void setName(String n){
         name = n;
     }


}

class CellPhone {
    public void Ring() {
        System.out.println("Ringing.....");
    }

    public void Vibrate() {
        System.out.println("Vibrating.....");
    }

    public void Snooze() {
        System.out.println("Snoozing.......");
    }

    public void callFriend() {
        System.out.println("Snoozing.......");
    }

}

class Square{
     int side;
     public int area(){
         return side*side;
     }
     public int perimeter(){
         return 4*side;
     }
}

class Rectangle{
     int Length;
     int Breadth;
     public int area(){
         return Length*Breadth;
     }
     public int Perimeter(){
         return 2*(Length + Breadth);
     }
}

class Tommy{
     public  void hit(){
         System.out.println("Hitting....");
     }
     public  void run(){
         System.out.println("Running....");
     }
     public void fire(){
         System.out.println("Firing....");
     }

}

class circle {
     int radius;
     double pi;
     public double area(){
         return pi*(radius*radius);
     }
     public double perimeter(){
         return 2*(pi*radius);
     }
     }


    public class Cwh_Ps08 {
        public static void main(String[] args) {

            // problem 1

//        Employee akeel = new Employee();
//        akeel.setName("akeel shafi kana");
//        akeel.salary = 400000;
//        System.out.println(akeel.getSalary());
//        System.out.println(akeel.getName());

            // problem 2
//            CellPhone iphone = new CellPhone();
//            iphone.Ring();
//            iphone.Vibrate();
//            iphone.Snooze();
//            iphone.callFriend();

            // problem 3
//            Square Sq = new Square();
//            Sq.side = 3;
//            System.out.println(Sq.area());
//            System.out.println(Sq.perimeter());

            // problem4
       /*     Rectangle rec = new Rectangle();
            rec.Length = 4;
            rec.Breadth = 6;
            System.out.println(rec.area());
            System.out.println(rec.Perimeter());*/

            // PROBLEM5
         /*   Tommy game = new Tommy();
            game.hit();
            game.run();
            game.fire();*/

            // PROBLEM6
            circle c = new circle();
            c.radius = 5;
            c.pi=3.14;
            System.out.println(c.area());
            System.out.println(c.perimeter());








        }

    }




