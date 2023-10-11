package JavaPracticePrograms;
class employee{
    private int salary;
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
}

class cellPhone1{
    private String vibrate;
    private String ring;
    private String call;

    public String getVibrate() {
        return vibrate;
    }

    public void setVibrate(String vibrate) {
        this.vibrate = vibrate;
    }

    public String getRing() {
        return ring;
    }

    public void setRing(String ring) {
        this.ring = ring;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }
}
public class How_much_i_knows {
    public static void main(String[] args) {
        // problem 1
/*        employee obj = new employee();
        obj.setName("akeelShafiKana");
        obj.setSalary(10000);
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());*/

        // problem 2
        cellPhone1 phone = new cellPhone1();
        phone.setCall("calling...");
        phone.setVibrate("vibrating...");
        phone.setRing("ringing...");
        System.out.println(phone.getCall());
        System.out.println(phone.getRing());
        System.out.println(phone.getVibrate());

    }
}
