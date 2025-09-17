import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        // 1. Initialize Scanner and Random objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Game parameters
        int minRange = 1;
        int maxRange = 100;
        int attempts = 0;
        int userGuess;
        boolean guessedCorrectly = false;

        // 2. Generate the secret number
        // nextInt(max - min + 1) + min formula to get a number inclusive of min and max
        int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        // Introduction
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");

        // 3. Start the main guessing loop
        while (!guessedCorrectly) {
            
            // Increment attempt counter
            attempts++;

            // 4. Prompt for user input
            System.out.print("Attempt #" + attempts + ": Enter your guess: ");
            
            // Check if input is an integer before reading it
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
            } else {
                // Handle non-integer input
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next(); // Consume the invalid input to clear the buffer
                attempts--; // Don't count this as a valid attempt
                continue;   // Jump to the next iteration of the loop
            }

            // 5. Compare the guess and provide feedback
            if (userGuess < secretNumber) {
                System.out.println("Too low! Try a higher number.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try a lower number.");
            } else {
                // Guess is correct!
                guessedCorrectly = true;
                System.out.println("\n🎉 Congratulations! You guessed the number " + secretNumber + " correctly!");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        // 6. Close the scanner
        scanner.close();
    }
}