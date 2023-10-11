package JavaPracticePrograms;
class circle1{
    public int radius;
    public circle1(){
        System.out.println("I am parameter constructor of circle1");
       radius = 14;
    }
    public double area(){
        return Math.PI*radius*radius;

    }
}
class cylinder extends circle1{
    public int height;
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class Cwh_Ps_10 {
    public static void main(String[] args) {
        // Problem1
        cylinder h = new cylinder();
     //   circle1 c = new circle1();




    }
}
