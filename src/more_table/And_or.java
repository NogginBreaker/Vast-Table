package more_table;
/*
 * Zachary Moncur
 * 10/15
 */
import java.util.Scanner;
public class And_or {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Receive an input
		System.out.println("Enter an integer: ");
		int number1 = input.nextInt();
		
		// Both of these conditions must be met
		if (number1 % 2 ==0 && number1 % 3 ==0) {
			System.out.println(number1 + " is divisible by 2 and 3");
		}
		// Only one of the conditions must be met
		if (number1 % 2 ==0 || number1 % 3==0) {
			System.out.println(number1 + " is divisible by 2 or 3");
		}
		// Exclusive or
		if (number1 % 2 ==0 ^ number1 % 3==0) {
			System.out.println(number1 + " is divisible by 2 or 3, but not both ");
		}
		else {
			System.out.println("Your number is not divisible by 2 or 3");
		}
		
		
	}

}
