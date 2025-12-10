import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int score = 0;
        char playAgain;

        do {
            int numberToGuess = rand.nextInt(100) + 1; // Random number 1 to 100
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\n--- Number Guessing Game ---");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts only!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    guessed = true;
                    score++; // Score for correct guess
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too High! Try Again.");
                } else {
                    System.out.println("Too Low! Try Again.");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!guessed) {
                System.out.println("Out of attempts! The correct number was: " + numberToGuess);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (Yes/No): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\nThanks for playing! Your final score is: " + score);
        sc.close();
    }
}
