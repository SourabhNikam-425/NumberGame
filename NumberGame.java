import java.util.Random;
import java.util.Scanner;

class NumberGame {

    public static void main(String[] args) {
        int isCorrectGuess=0;
        System.out.println("You Have 3 try to guess the Number.");
        System.out.println("Let's Begin ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Range of Number :");
        Random rand = new Random();
        int range = sc.nextInt();
        int rand_int1 = rand.nextInt(range);
        System.out.println("The range of the generated number is 0 to " + (range - 1));
    

        
        for(int j=1;j<4;j++){
            System.out.println("This is your " + j+ " round" );
            
        int i = 0;
        for (i = 0; i < 3; i++) {
            System.out.print(" Enter your Guess : ");
            int guess = sc.nextInt();
            if (guess > rand_int1) {
                System.out.println("Nice Try !! . Try to guess a Smaller Number  ");
            } else if (guess < rand_int1) {
                System.out.println("Nice Try !! . Try to guess a Greater Number ");
            } else if (guess == rand_int1) {
                System.out.println("Congratulations you Guess the Correct Number ");
                isCorrectGuess=1;
                break;
            }   
        }
        System.out.println("Sorry , Your Try are over.");

        if (isCorrectGuess==1) {
            break;
            
        }
    
        }
        sc.close();
    }
}