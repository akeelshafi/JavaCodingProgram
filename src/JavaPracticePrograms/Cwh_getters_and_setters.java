package JavaPracticePrograms;

    class MyEmployee {
        private int id;
        private String name;

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
public class Cwh_getters_and_setters {
    public static void main(String[] args) {
        MyEmployee Akeel = new  MyEmployee();
        Akeel.setId(24);
        Akeel.setName("akeelshfi");
        System.out.println(Akeel.getId());
        System.out.println(Akeel.getName());

    }
}





