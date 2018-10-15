package more_table;

import java.util.Scanner;

public class Area_cricle {

	public static void main(String[] args) {

		System.out.println("Enter radius");
		Scanner input = new Scanner(System.in);
		
		//Constants
		final double PI = 3.141592653589793238462643383279502884197169399375105820974944592307816406;
		
		//Variables
		double radius;
		double area;
		
		//Calculations 
		radius = input.nextDouble();
		area = radius*radius*PI;
		
		//Display Result
		System.out.println("the area of your circle is: " 
		+ area +"\"");

	}

}
