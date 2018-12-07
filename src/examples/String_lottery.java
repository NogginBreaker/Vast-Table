package examples;

import java.util.Scanner;

public class String_lottery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user
		System.out.println("Enter in a 2 digit hex 0-9");
		String guess = input.nextLine();
		
		// If the guess is not 3 digits the program ends
		if (guess.length() != 2) {
			System.out.println("Please enter in 2 digits");
			System.exit(1);
		}
		
		// Users input
		char ch1 = Character.toUpperCase(guess.charAt(0));
		char ch2 = Character.toUpperCase(guess.charAt(1));
		
		// Random numbers
		char l1 = Character.toUpperCase((char) (Math.random() / 10));
		char l2 = Character.toUpperCase((char) (Math.random() % 10));
		
		// Compare the numbers
		if (ch1 == l1 && ch2 == l2) {
			System.out.println("Congradulations! You have an exact match. You have won $10,000");
		}
		else if (ch2 == l1 && ch1 == l2) {
			System.out.println("Congradulations! You have matched all digits. You have won $3,000");
		}
		else if (ch1 == l1
				||ch1 == l2
				||ch2 == l1
				||ch2 == l2) {
			System.out.println("Congradulations! You have matched one digit. You have won $1,000");
		}
		
		System.out.println("Welcome to the nine hells, comrade");
		
	}

}
