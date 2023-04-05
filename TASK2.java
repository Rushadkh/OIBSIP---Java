import java.util.Random;
import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100 (inclusive)
        int guess = 0;
        int numGuesses = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numGuesses++;

            if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
            }
        }
    }
}

