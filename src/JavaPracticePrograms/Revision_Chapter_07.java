package JavaPracticePrograms;

public class Revision_Chapter_07 {
    static  void multiplication(int n){
        for (int i =1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
    static  void pattern(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  int sumRec(int n){
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
        if (n==1 || n ==2){
            return 1;
        }
        else {
            return fib(n-1)+ fib(n-1);
        }
    }
    static  void pattern3(int n){
        if (n>0){
            pattern3(n-1);
            for (int i=n;i>0;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    int mySum(int a,int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        // problem 1
      //  multiplication(7);

        // problem 2
      // pattern(10);

        // problem 3
       // int c = sumRec(3);
       // System.out.println(c);

        // problem 4
      // pattern2(4);

        // problem 5
      // int c = fib(5);
      //  System.out.println(c);

        // problem 6
      //  pattern3(4);
      //  Revision_Chapter_07 obj = new Revision_Chapter_07();
     //   System.out.println(obj.mySum(5,10));




    }
}
