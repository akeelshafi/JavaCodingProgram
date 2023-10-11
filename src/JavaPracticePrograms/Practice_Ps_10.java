package JavaPracticePrograms;

class Circle2{
    private int radius;

    public void setRadius(int radius){
        this.radius= radius;
    }
    public int getRadius(){
        return radius;
    }
}
class Cylinder5 extends Circle2{
    private int height;

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
}

class rectangle{
     int length;
     int breadth;
    public rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
class cuboid extends rectangle {
    int height;
    public cuboid(int length, int breadth, int height) {
        super(length, breadth);
    }
    }
class  circle3{
    public  int radius;

    public circle3(){
        this.radius = 5;
    }
    public double area(){
        return Math.PI *radius*radius;
    }
}
class cylinder6 extends circle3{
    public  int height;

    public cylinder6(){
        this. height = 10;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class rectangle1{
    public  int length;
    public  int breadth;

    public void setLength(int length){
        this.length= length;
    }
    public int getLength(){
        return length;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }
    public  int getBreadth(){
        return breadth;
    }
    public  int area(){
        return length*breadth;
    }
}
class cuboid1 extends rectangle1{
    public int height;

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return  height;
    }
    public int volume(){
        return length*breadth*height;
    }
}
public class Practice_Ps_10 {
    public static void main(String[] args) {
        // problem 1
//        Cylinder5 ch = new Cylinder5();
//        ch.setRadius(5);
//        ch.setHeight(10);
//        System.out.println(ch.getRadius());
//        System.out.println(ch.getHeight());

         // problem 2
//        cuboid ch = new cuboid(5,10,15);
//        System.out.println(ch.length);
//        System.out.println(ch.breadth);
//        System.out.println(ch.height);

        // problem 3
//        cylinder6   ch = new cylinder6();
//        System.out.println( ch.area());
//        System.out.println( ch.volume());

        // problem 4
//        cuboid1 ch = new cuboid1();
//        ch.setHeight(10);
//        ch.setBreadth(5);
//        ch.setLength(10);
//        System.out.println(ch.volume());
//        System.out.println(ch.area());













    }
}
