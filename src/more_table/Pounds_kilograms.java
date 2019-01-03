package more_table;
import java.util.Scanner;
public class Pounds_kilograms {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Setting the variables
		double pounds;
		double kilograms;
		
		
		// Gathering input from the user
		System.out.println("Enter a weight in pounds");
		pounds = input.nextDouble();
		kilograms = pounds*0.454;
		
		
		// Display the result
		System.out.println("Your kilograms are: "+kilograms);
		

	}

}
