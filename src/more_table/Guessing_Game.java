package more_table;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Guessing_Game {

	public static void main(String[] args) {
		// Scanner tool
		Scanner input = new Scanner (System.in);
		
		// Generate a random number
		int random = ThreadLocalRandom.current().nextInt(1,100);
		
		// Introduce the player to the game
		System.out.println("Welcome to the guessing game. Today you'll need \n"
						 + "to enter a number of 1-100 correctly");
		
		// Receive input from player
		System.out.println("Enter your guess: ");
		int guess = input.nextInt();
		
		// Attempts
		int attempts = 0;
		
		// Loop time
		while (attempts == 10 || guess != random) {
			// Attempts made
			attempts++;
			// Guess must be higher than random
			if (guess > random) {
				System.out.println("Guess lower");
			}
			// Guess is lower than random
			if (guess < random) {
				System.out.println("Guess higher");
			}
			// Ends the program
			if (attempts >= 10) {
				break;
			}
			// Lets your restart the loop
			guess = input.nextInt();
		}
		// If you won
		if (guess == random) {
			System.out.println("CoNgraDuLatIonS you won. It took you " +attempts+ " attempts");
		}
		// If you lost
		else {
			System.out.println("Soury, you lost. It took you " +attempts+ " too many attempts");
		}
		
		
		
	}

}
