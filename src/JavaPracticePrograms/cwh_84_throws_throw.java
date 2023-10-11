package JavaPracticePrograms;

class NegativeRadiusException extends Exception {
    @Override
    public String toString()  {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}
public class cwh_84_throws_throw {
    public static double area (int r)throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static void main(String[] args) {

    }
}
