package JavaPracticePrograms;

public class Cwh_Ps_07 {
    static void multiplication(int n){
        for (int i =1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i, n*i);
        }
    }
    static void pattern1(int n){
    for (int i=0;i<n;i++){
        for (int j=0;j<i+1;j++){
            System.out.print("*");
        }
        System.out.println();
      }
    }

    static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    static void pattern2(int n){
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static  int fib(int n){
        if (n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n-1) + fib(n-1);
        }
    }

    static  void pattern3(int n){
        if (n>0){
            pattern3(n-1);
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // problem1
 //       multiplication(7);

        // problem2
 //        pattern1(10);

        // problem3
 //       int c = sumRec(4);
 //       System.out.println(c);

        // problem4
//       pattern2(4);

        // problem5
//        int c = fib(5);
//        System.out.println(c);

        // problem6
//        pattern3(4);

        // problem7



    }
    }




