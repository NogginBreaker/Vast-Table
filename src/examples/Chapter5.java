package examples;

import java.util.Scanner;

public class Chapter5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		template(input);
	}
		
	public static void template(Scanner input) {
		// Prompt the user to enter a Hex digit
		System.out.println("Enter a hex digit 0-15 and A-P");
		String hexString = input.nextLine();
		
		// Converts the users input to Upper case
		char ch = Character.toUpperCase(hexString.charAt(0));
		
		// Confirmation that the String has been converted to upper case
		if (ch <='P' && ch >='A') {
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



	public static void template1(Scanner input) {
		// ASCII code to character
		System.out.println("Enter an ASCII code (numbers 48-90)");
		int Code = input.nextInt();
		switch (Code % 90) {
		case 65:
			System.out.println("A");
			break;
		case 66:
			System.out.println("B");
			break;
		case 67:
			System.out.println("C");
			break;
		case 68:
			System.out.println("D");
			break;
		case 69:
			System.out.println("E");
			break;
		case 70:
			System.out.println("F");
			break;
		case 71:
			System.out.println("G");
			break;
		case 72:
			System.out.println("H");
			break;
		case 73:
			System.out.println("I");
			break;
		case 74:
			System.out.println("J");
			break;
		case 75:
			System.out.println("K");
			break;
		case 76:
			System.out.println("L");
			break;
		case 77:
			System.out.println("M");
			break;
		case 78:
			System.out.println("N");
			break;
		case 79:
			System.out.println("O");
			break;
		case 80:
			System.out.println("P");
			break;
		case 81:
			System.out.println("Q");
			break;
		case 82:
			System.out.println("R");
			break;
		case 83:
			System.out.println("S");
			break;
		case 84:
			System.out.println("T");
			break;
		case 85:
			System.out.println("U");
			break;
		case 86:
			System.out.println("V");
			break;
		case 87:
			System.out.println("W");
			break;
		case 88:
			System.out.println("X");
			break;
		case 89:
			System.out.println("Y");
			break;
		case 90:
			System.out.println("Z");
			break;
		}
		
		
		}
	}
