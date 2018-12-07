package examples;
/*
 * Zachary Moncur
 * 11/7/18
 */
import java.util.Scanner;
public class HexDigit_to_Decimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a Hex digit
		System.out.println("Enter a hex digit 0-9 and A-F");
		String hexString = input.nextLine();
		
		
		// Confirmation that the String is a single character long 
		if (hexString.length() != 1) {
			System.out.println("You must enter a single digit");
			System.exit(1);
		}
		
		// Converts the users input to Upper case
		char ch = Character.toUpperCase(hexString.charAt(0));
		
		// Confirmation that the String has been converted to upper case
		if (ch <='F' && ch >='A') {
			int value = ch - 'A' + 10;
			System.out.println("The decimal value for hex digit " + ch + " is " + value);
		}
		
		// Confirmation to see if the character is a digit
		else if (Character.isDigit(ch)) {
			System.out.println("The decimal value for hex digit " + ch + " is " + ch);
		}
		
		//
		else {
			System.out.println(ch + " Is an invalid value");
		}
		
		// Remember that hex digits run from 0 - 15 (which is 16 digits)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
