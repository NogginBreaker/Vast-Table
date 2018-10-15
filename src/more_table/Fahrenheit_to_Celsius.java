package more_table;
/*
 * Zachary Moncur
 */
import java.util.Scanner;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Variables
		double C;
		double F;
		
		//Ask for input
		System.out.println("Type in Celsius");
		C = input.nextInt();
		
		F = (9.0/5)*C+32;
		
		//Display output
		System.out.println("Here is the temperature in fahrenheit: "+F);
	

	}

}
