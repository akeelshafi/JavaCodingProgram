package JavaPracticePrograms;

class Cylinder8{
    private  int radius;
    private  int height;
    Cylinder8(){
        this.height = 2;
        this.radius = 2;
    }

    public  void setRadius(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height){
        this.height= height;
    }
    public int getHeight(){
        return height;
    }
    public double surfaceArea(){
        return 2*Math.PI * radius * height + 2*Math.PI * radius*radius;
    }
}
class rectangle8{
    public  int length;
    public int breadth;
    rectangle8(int length, int breadth){
    }
}

public class Revision_Chapter_09 {
    public static void main(String[] args) {
        // problem 1
     //   Cylinder8 obj = new Cylinder8();
       // obj.setRadius(5);
      //  obj.setHeight(10);
      //  System.out.println(obj.surfaceArea());
        rectangle8 obj = new rectangle8(4,5);


    }
}
