package more_table;
import java.util.Scanner;
/*
 * Zachary Moncur
 * 10/17
 */
public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		// Receiving input
		System.out.println("Please enter in a 3 digit number");
		int number = input.nextInt();
		
		// Breaking up the input
		int number1 = number / 100;
		int number2 = number / 10;
		number2 = number2 % 10;
		int number3 = number % 10;
		
		// If statements
		if (number1 == number3) {
			System.out.println("Your number is a palindrome");
		}
		else {
			System.out.println("Your number is not a palindrome");
		}
		
		
		
	}

}
