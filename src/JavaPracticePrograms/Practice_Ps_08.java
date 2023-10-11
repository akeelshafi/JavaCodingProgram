package JavaPracticePrograms;
class Employee2{
    public int salary;
    public String name;

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class CellPhone2{
    public void Ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }

}
class Square2 {
     int side;
    public int area(){

        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle2{
    int length;
    int breath;

    public int area(){

        return length*breath;
    }
    public int perimeter(){
        return 2*(length+breath);
    }
}
class Tommy2{
    public void hit(){
        System.out.println("hitting...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void fire(){
        System.out.println("Firing...");
    }

}
class circle2{
    int radius;

    public double area(){
        return Math.PI*(radius*radius);
    }
    public double perimeter(){

        return 2*(Math.PI*radius);
    }

}
public class Practice_Ps_08 {
    public static void main(String[] args) {
       // problem1
//       Employee2 ch = new Employee2();
//       ch.setSalary(10000);
//       ch.setName("Akeel shafi kana");
//        System.out.println(ch.getSalary());
//        System.out.println(ch.getName());

        // problem 2
//        CellPhone2 ch = new CellPhone2();
//        ch.vibrate();
//        ch.Ring();

        // problem 3
//       Square2 ch =new Square2();
//       ch.side=10;
//        System.out.println("The area of square is: "+ ch.area());
//        System.out.println("The perimeter of square is: " + ch.perimeter());

        // problem 4
//        Rectangle2 ch = new Rectangle2();
//        ch.length = 10;
//        ch.breath = 5;
//        System.out.println("The area of rectangle is: "+ ch.area());
//        System.out.println("The perimeter of rectangle is: "+ ch.perimeter());

        // problem 5
//        Tommy2 ch = new Tommy2();
//        ch.fire();
//        ch.run();
//        ch.hit();

        // problem 6
//        circle2 ch = new circle2();
//        ch.radius =5;
//        System.out.println("The area of a circle is :"+ ch.area());
//        System.out.println("The perimeter of a circle is :"+ ch.perimeter());






    }
}
