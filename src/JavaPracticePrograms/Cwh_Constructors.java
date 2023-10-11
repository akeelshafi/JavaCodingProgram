package JavaPracticePrograms;
class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 34;
        name = "akeelShafiKana";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }
}
public class Cwh_Constructors {
    public static void main(String[] args) {
//        MyMainEmployee Akeel = new MyMainEmployee();
//        System.out.println(Akeel.getId());
//        System.out.println(Akeel.getName());

    }
}
