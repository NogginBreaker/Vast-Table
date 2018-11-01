package examples;
import java.util.Scanner;
/*
 * Zachary Moncur
 * 11/1
 */
public class Strings {

	public static void main(java.lang.String[] args) {
		Scanner input = new Scanner(System.in);
		
		// String message
		String message = "Welcome to Java";
		String message2 = "Java is fun";
		
		
		// Length of message
		System.out.println(message.length());
		System.out.println(message2.length());
		
		
		// Length of "Welcome to Java"
		System.out.println("Welcome to Java".length());
		
		
		// Specifically calls out a char
		System.out.println(message.charAt(8));
		
		
		// Get string input and return a character
		char x = input.nextLine().charAt(0);
		
		
		// Concatenate a message
		System.out.println(message.concat(message2));
	
		
		// Will print out messages
		System.out.println(message+message2);
		message += message2;
		message = message+message2;
		
		
		// Input strings from the user
		String x1 = input.next();
		x1 = input.nextLine();
		
		
		// Does equals
		if (message.equals("Welcome to Java")) {
			System.out.println("You're in");
		}
		else {
			System.out.println("You're not in");
		}
		// Does not equal
		if (!message.equals("Welcome to Java")) {
			System.out.println("You're in");
		}
		else {
			System.out.println("You're not in");
		}
		// Ignore upper case 
		if (!message.equalsIgnoreCase("Welcome to Java")) {
			System.out.println("You're in");
		}
		// Compare the messages
		int y1 = message.compareTo(message2);
		System.out.println(x);
		// Tells us if the message will start with "Welcome"
		boolean y = message.startsWith("Welcome");
		System.out.println(y);
		// Tells if your message contains something
		boolean z = message.contains("Welcome");
		System.out.print(z);
		
		
	}

}
