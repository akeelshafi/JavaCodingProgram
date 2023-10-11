package JavaPracticePrograms;

public class Revision_Chapter_06 {
    public static void main(String[] args) {
        // problem1
      /*  float sum =0;
        float marks[] ={100.f,100.f,100.f,100.f,100.f};
        for (int i=0;i< marks.length;i++){
            sum = sum + marks[i];
        }
        System.out.println(sum);*/

        // problem 2
      /*  int marks []={100,80,90,40,60};
        int num = 10;
        boolean isInArray = false;
        for(int element:marks){
            if (num==element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in the array");
        }else {
            System.out.println("The value is not present in the array");
        }
*/

        // problem 3
       /* float marks[]={100,100,100,100,100};
        float sum =0;
        for (float element : marks){
            sum = sum + element;
        }
        System.out.println("The average marks of array is :" + sum /marks.length);*/

        // problem 5

        /*int marks [] ={100,25,10,20,1000};
        int max =0;
        for (int element : marks){
            if (element>max) {
                max = element;
            }
        }
        System.out.println("The value of maximum element in this array is: "+ max);*/

        // problem 6
      /*  int marks [] ={100,25,10,20,1000};
        int min = Integer.MIN_VALUE;
        for (int element : marks){
            if (element == min) {
                min = element;
            }
        }
        System.out.println("The value of minimum element in this array is: " + min);*/

        // problem 7
        int [] arr={100,200,400,666,};
        boolean isArraySorted = true;
        for (int i=0;i< arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isArraySorted = false;
                break;
            }
        }
        if (isArraySorted){
            System.out.println("This array is sorted");
        }else {
            System.out.println("This array is not sorted");
        }

    }
}
