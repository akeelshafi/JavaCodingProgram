package JavaPracticePrograms;
  class Employee1{
    int id;
    int salary;
    String name;
     public void printDetails(){
         System.out.println("My name is: " + name);
         System.out.println("My id is: " + id);
         System.out.println("My salary is: "+ salary);
     }

}
public class Cwh_Custom_Class {
    public static void main(String[] args) {
     Employee1 akeel = new Employee1();
     Employee1 babu = new Employee1();

     akeel.name ="akeel Shafi";;
     akeel.id= 29;
     akeel.salary =100000;

     babu.name="akeel Fayaz";
     babu.id=18;
     babu.salary=200000;

     akeel.printDetails();
     babu.printDetails();


    }

}
