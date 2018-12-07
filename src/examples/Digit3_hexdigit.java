package examples;
import java.util.Scanner;
public class Digit3_hexdigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int value1 = 0;
		int value2 = 0;
		int value3 = 0;
		
		// Prompt the user to enter a Hex digit
		System.out.println("Enter a three digit hex digit 0-9 and A-F");
		String hexString = input.next();
		
		// Confirmation that the String is a single character long 
		if (hexString.length() != 1 || hexString.length() != 1 || hexString.length() != 1) {
			System.out.println("You must enter three digits");
			System.exit(1);
		}
		
		// Converts the users input to Upper case
		char ch1 = Character.toUpperCase(hexString.charAt(0));
		char ch2 = Character.toUpperCase(hexString.charAt(1));
		char ch3 = Character.toUpperCase(hexString.charAt(2));
		
		
		if (ch1 <='F' && ch1 >='A') {
			value1 = ch1 - 'A' + 10;	
		}
		else if (Character.isDigit(ch1)) {
			value1 = ch1;
		}
		
		if (ch2 <='F' && ch2 >='A') {
			int value = ch2 - 'A' + 10;
		}
		else if (Character.isDigit(ch2)) {
			value2 = ch2;
		}
		if (ch3 <='F' && ch3 >='A') {
			value1 = ch3 - 'A' + 10;	
		}
		else if (Character.isDigit(ch1)) {
			value3 = ch3;
		}
		
		
		else {
			System.out.println();
		}
		
		
		
		
		
	}

}
