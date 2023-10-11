package JavaPracticePrograms;
class Sphere{
    private int height;
    private int radius;

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
}
class myRectangle{
    private int length;
    private int breadth;

    public myRectangle(){
        length = 10;
        breadth = 45;
    }

    public myRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

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


    class Cylinder {
        private int height;
        private int radius;

        public Cylinder(int height, int radius) {
            this.height = height;
            this.radius = radius;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getHeight() {
            return height;
        }


        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;

        }

        public double surfaceArea() {
            return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
        }

        public double volume() {
            return Math.PI * radius * radius * height;
        }
    }


public class Cwh_Practice_Set_09 {
    public static void main(String[] args) {
//        // problem 1
//        Cylinder gas = new Cylinder();
//        gas.setHeight(12);
//        gas.setRadius(8);
//        System.out.println("The height of gas cylinder is: " + gas.getHeight());
//        System.out.println("The radius of gas cylinder is: " + gas.getRadius());

        // peoblem 2
//        Cylinder gas = new Cylinder();
//         gas.setHeight(12);
//         gas.setRadius(8);
//        System.out.println(gas.surfaceArea());
//        System.out.println(gas.volume());
//         System.out.println("The height of gas cylinder is: " + gas.getHeight());
//         System.out.println("The radius of gas cylinder is: " + gas.getRadius());

        // problem 3
//        Cylinder gas = new Cylinder(12,8);
//       System.out.println(gas.surfaceArea());
//        System.out.println(gas.volume());
//        System.out.println("The height of gas cylinder is: " + gas.getHeight());
//        System.out.println("The radius of gas cylinder is: " + gas.getRadius());

        // problem 4
//        myRectangle r = new myRectangle();
//        System.out.println(r.getLength());
//        System.out.println(r.getBreadth());

        // problem5
        Sphere s = new Sphere();
        s.setHeight(8);
        s.setRadius(12);
        System.out.println(s.getHeight());
        System.out.println(s.getRadius());







    }
}
