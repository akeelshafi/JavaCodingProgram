package JavaPracticePrograms;

public class Cwh_arrays {
    public static void main(String[] args) {
       // int[] marks = new int[5];
      //  int [] marks;
//       marks = new int[5];
//        marks[0] = 100;
//        marks[1] = 80;
//        marks[2] = 60;
//        marks[3] = 40;
//        marks[4] = 20;

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
        System.out.println("printing using for loop in reverse order");
        int [] marks ={100,80,60,40,20};
        for (int i= marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("printing using for loop");
        int [] marks1 ={100,80,60,40,20};
        for (int i=0;i< marks.length;i++){
            System.out.println(marks1[i]);
        }

        System.out.println("printing using for each loop");
        int marks2 []={100,80,60,40,20};
        for (int element:marks2){
            System.out.println(element);
        }




    }
}
