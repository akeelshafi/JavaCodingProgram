package JavaPracticePrograms;

 class Cwh_varargs {
       static int sum(int...arr) {
        int result=0;
        for (int element:arr){
            result +=element;
        }
           return result;

       }

    public static void main(String[] args) {

        System.out.println("The sum of 4 and 5 is : " + sum(4,5));
        System.out.println("The sum of 4 and 5 and 10 is : " + sum(4,5,10));
        System.out.println("The sum of 4 and 5 and 10 and 20 is : " + sum(4,5,10,20));
    }
}

