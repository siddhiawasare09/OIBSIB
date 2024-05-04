import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0; // Initialize guess variable
        int attempts = 0;

        System.out.println("-----------**Welcome to the Number Guessing Game!**-------------");
        System.out.println("I have chosen a number between 1 and 100. Can you guess it?");
        System.out.println("You have a maximum of 10 attempts. Let's get started!");

        while (attempts < 10) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }

        if (attempts == 10 && guess != numberToGuess) {
            System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess + ".");
        }

        scanner.close();
    }
}
