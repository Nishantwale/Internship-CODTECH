import java.util.Scanner;
import java.util.Random;



class numberguess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean continuegame = true;

        while (continuegame) {
            int randomNumber = random.nextInt(100) + 1;
        int maxattempts = 5;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Number Gusessing Game");
        System.out.println("I Have Picked a Random Number Between 1 to 100. Can You Guess it?");

        while(attempts<maxattempts){
            System.out.print("Enter A Guess: ");
            guess = sc.nextInt();
            attempts++;

            if(guess==randomNumber){
                System.out.println("Congratulations! You have guessed the correct number "+randomNumber+" in "+attempts+" attempts");
                break;
            }else if(guess<randomNumber){
                System.out.println("Too Low! Try Again");
            }else{
                System.out.println("Too High! Try Again");
            }
        }

        if(attempts==maxattempts){
            System.out.println("Sorry! You have used all your attempts. The correct number was "+randomNumber);
        }

        System.out.print("Do You Want to Play Again? (y/n) : ");
        String continueplay = sc.next();
        if(!continueplay.equalsIgnoreCase("y")){
            continuegame = false;
        }
        }

        System.out.println("Thank You For Playing Number Guessing Game! Good Day");
        sc.close();
    }
}
