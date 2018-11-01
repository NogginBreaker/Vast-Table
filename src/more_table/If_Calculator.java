package more_table;
/*
 * Zachary Moncur
 * 10/18
 */
import java.util.Scanner;

public class If_Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Get number input from user
		System.out.println("Enter your first value");
		double number1 = input.nextDouble();
		
		System.out.println("Enter your second value");
		double number2 = input.nextDouble();
		
		// Get operator input from user
		System.out.println("Enter your your operation, +,-,*,/");
		String operation = input.next();
		
		//Test input / calculations
		double total = 0;
	
		if (operation.equals("+") ) {
			total = number1 + number2;	
		}
		
		else if (operation.equals("-") ) {
			total = number1 - number2;	
			}
		
		else if (operation.equals("*") ) {
			total = number1 * number2;	
			}
		
		else if (operation.equals("/") ) {
			total = number1 / number2;	
			}
		else {
			System.out.println("Incorrect, doofus");
		}
		
		//Print output
		System.out.println("Your total was: " + total);

	}

}
