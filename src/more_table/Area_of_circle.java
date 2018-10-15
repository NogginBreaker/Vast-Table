package more_table;
/*
 * Zachary Moncur
 */
import java.util.Scanner;

public class Area_of_circle {

	public static void main(String[] args) {
		System.out.println("Enter radius");
		Scanner input = new Scanner(System.in);
		
		//Variables
		final double PI = 3.14;

		double radius;
		double area;
		
		radius = input.nextDouble();
		area = radius*radius*PI;
		
		//Calculation
		if (radius < 0) {
			System.out.println("You can't have a negative radius");
		}
		else {
		
		System.out.println("the area of your circle is: " 
		+ area +"\"");
		}
	

	}

}