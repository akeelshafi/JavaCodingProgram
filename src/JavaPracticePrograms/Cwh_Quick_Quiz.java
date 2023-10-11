package JavaPracticePrograms;
class MainEmployee{
    private String Name;
    private int Salary;

    public MainEmployee(String myName,int mySalary){
        Name = myName;
        Salary = mySalary;
    }
    public void setName(String n){
        this.Name = n;
    }
    public String getName(){
        return Name;
    }
    public  void setSalary(int i){
        this.Salary = i;
    }
    public int getSalary(){
        return Salary;
    }
}

public class Cwh_Quick_Quiz {
    public static void main(String[] args) {
        MainEmployee Akeel = new MainEmployee("akeelShafiKana",10000);
        System.out.println(Akeel.getName());
        System.out.println(Akeel.getSalary());

    }
}
