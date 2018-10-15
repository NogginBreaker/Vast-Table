package more_table;

import java.util.Scanner;

public class Inches_meters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double inches;
		double meters;
		
		System.out.println("Enter a length in inches");
		inches = input.nextDouble();
		meters = inches*0.0254;
		
		System.out.println("Your meters are: "+meters);
		

	}

}
