package more_table;
/*
 * Zachary Moncur
 * 10/15
 */
import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Receive an input
		System.out.println("Enter an integer: ");
		int number1 = input.nextInt();
		
		// Both of these conditions must be met
		if (number1 % 5 ==0 && number1 % 6 ==0) {
			System.out.println(number1 + " is divisible by 5 and 36");
		}
		// Only one of the conditions must be met
		if (number1 % 5 ==0 || number1 % 6 ==0) {
			System.out.println(number1 + " is divisible by 5 or 36");
		}
		// Exclusive or
		if (number1 % 5 ==0 ^ number1 % 6 ==0) {
			System.out.println(number1 + " is divisible by 5 or 6, but not both ");
		}
		else {
			System.out.println("Your number is not divisible by 5 or 6");
		}
		
		
	}

}
