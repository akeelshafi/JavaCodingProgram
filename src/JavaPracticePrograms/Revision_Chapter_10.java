package JavaPracticePrograms;
class  circle4{
    int radius;
    circle4(){
        this.radius = 4;
    }
    }

class  cylinder10 extends circle4{

}
class rectangle11{
    int length;
    int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
class cuboid4 extends rectangle11{
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int volume(){
        return length*breadth*height;
    }
}

public class Revision_Chapter_10 {
    public static void main(String[] args) {
        // problem 1
       cuboid4 obj = new cuboid4();
       obj.setHeight(10);
       obj.setBreadth(10);
       obj.setLength(10);
        System.out.println(obj.volume());
    }
}
