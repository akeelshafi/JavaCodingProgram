package JavaPracticePrograms;

/*class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getInputNumber(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt();
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner SC = new Scanner(System.in);
        inputNumber =SC.nextInt();
    }
    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number){
            System.out.format("Yes you guessed it right, it was %d\ guessed it right in %d attempts",number,noOfGuesses );
            return true;
        }
    }
    }

public class cwh_Ex_03 {
    public static void main(String[] args) {

    }
}   /*
 */
