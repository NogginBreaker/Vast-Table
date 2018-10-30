package more_table;
import java.util.Scanner;
/*
 * Zachary Moncur
 * 10/15
 */
public class Feet_meters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double feet;
		double meters;
		
		System.out.println("Enter a length in feet");
		feet = input.nextDouble();
		meters = feet*0.305;
		
		System.out.println("Your length in meters is: " + meters);
		
		
	}

}
