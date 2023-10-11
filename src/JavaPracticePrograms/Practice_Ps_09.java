package JavaPracticePrograms;

class Cylinder2{
    int radius;
    int height;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height = height;
    }
}
class Cylinder3{
    private int radius;
    private int height;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height = height;
    }
    public double surfaceArea(){
        return 2* (Math.PI*radius*height) + 2*(Math.PI*radius*radius);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

class Cylinder4{
    int radius;
    int height;

    public Cylinder4() {
        this.radius = 5;
        this.height = 10;
    }
    public double surfaceArea(){
        return 2* (Math.PI*radius*height) + 2*(Math.PI*radius*radius);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class Rectangle4{
    int length;
    int breadth;

    public Rectangle4(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public  int area(){
        return length*breadth;
    }

}

class  Sphere2{
    int radius;
    int height;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return  radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
}
public class Practice_Ps_09 {
    public static void main(String[] args) {
        // problem 1
//        Cylinder2 ch = new Cylinder2();
//        ch.setRadius(5);
//        ch.setHeight(10);
//        System.out.println("The radius of cylinder is " + ch.getRadius());
//        System.out.println("The height of cylinder is " + ch.getHeight());

        // problem 2
//        Cylinder3 ch = new Cylinder3();
//        ch.setHeight(10);
//        ch.setRadius(5);
//        System.out.println( "The surface-area of cylinder is :" + ch.surfaceArea());
//        System.out.println( "The volume of cylinder is :" + ch.volume());

        // problem 3
//        Cylinder4 ch = new Cylinder4();
//        System.out.println( "The surface-area of cylinder is :" + ch.surfaceArea());
//        System.out.println( "The volume of cylinder is :" + ch.volume());

        // problem 4
//        Rectangle4 ch = new Rectangle4(4,5);
//        System.out.println(ch.area());

         // problem 5
        Sphere2 ch  =new Sphere2();
        ch.setHeight(10);
        ch.setRadius(5);
        System.out.println(ch.getHeight());
        System.out.println(ch.getRadius());












    }
}
