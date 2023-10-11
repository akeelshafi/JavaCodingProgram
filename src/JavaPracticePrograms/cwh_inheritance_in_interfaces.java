package JavaPracticePrograms;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface {
    public void meth1(){
        System.out.println("I am meth1...");
    }
    public void meth2(){
        System.out.println("I am meth2...");
    }
   public void meth3(){
       System.out.println("I am meth3...");
   }
   public void meth4(){
       System.out.println("I am meth4...");
   }

}
public class cwh_inheritance_in_interfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
