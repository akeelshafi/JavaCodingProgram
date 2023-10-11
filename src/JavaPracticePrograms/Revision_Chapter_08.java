package JavaPracticePrograms;

class Employee4{
    String name;
    int salary;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return  name;
    }
    public void setSalary(int salary){
        this.salary= salary;
    }
    public int getSalary(){
        return salary;
    }
}
class  Cell{
    public void ringing(){
        System.out.println("Ringing....");
}
public void vibrating(){
    System.out.println("vibrating.....");
}

}
class Square3{
    int side;
    public int area(){
        return side *side;
    }
    public  int perimeter(){
        return 4*side;
    }

}
class Rectangle5{
    int length;
    int breadth;
    Rectangle5(){
        length = 4;
        breadth = 3;
    }

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);

    }


}

public class Revision_Chapter_08 {

    public static void main(String[] args) {
  /*      // problem 1
        Employee4 obj = new Employee4();
        obj.setName("Akeel shafi kana");
        obj.setSalary(1000000);
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());*/

        // problem 2
     /*   Cell obj = new Cell();
        obj.ringing();
        obj.vibrating();
*/
        // problem 3
     /*   Square3 obj = new Square3();
        obj.side = 4;
        System.out.println(obj.area());
        System.out.println(obj.perimeter());*/

        // problem 4
 /*       Rectangle5 obj = new Rectangle5();
     //   obj.length =5;
      //  obj.breadth = 10;
        System.out.println("The length is: "+ obj.area());
        System.out.println("THe breath is : "+ obj.perimeter());*/






























































    }
}
