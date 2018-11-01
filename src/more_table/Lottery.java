package more_table;
import java.util.Scanner;
/*
 * Zachary Moncur
 * 10/15
 */
public class Lottery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a number with two digits
		// Generate random number
		// Compare the digits to see if there is a match
		// If there is a match proceed to if statements
		// If there is no match, alert the user
		
		
		// Generate a lottery number
		int lottery = (int)(Math.random() * 100);
		
		
		// Prompt the user for a guess
		System.out.println("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		
		
		// Get digits from the lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		
		// Get digits from the guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		
		// Output
		System.out.println("The lottery number is " + lottery);
		
		
		// Outcomes
		if (guess == lottery) {
			System.out.println("Congradulations! You have an exact match. You have won $10,000");
		}
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
			System.out.println("Congradulations! You have matched all digits. You have won $3,000");
		}
		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2) {
			System.out.println("Congradulations! You have matched one digit. You have won $1,000");
		}
		else {
			System.out.println("Sorry, no match");
		}
		

		
		
	}

}
