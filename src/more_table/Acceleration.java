package more_table;
import java.util.Scanner;
/*
 * Zachary Moncur
 * 10/15
 */
public class Acceleration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter in their starting velocity
		// Receive the first input for velocity
		// Prompt the user to enter in their next velocity
		// Receive the second input for velocity
		// Prompt the user to enter the time
		// Receive the time 
		// Subtract the two velocities
		// Receive sum
		// Divide by time
		// Alert the user
		
		
		double velocity1;
		double velocity2;
		double time;
		double acceleration;
		
		
		// Receive velocity2
		System.out.println("Enter in your starting velocity as meters/second");
		velocity2 = input.nextDouble();
		
		
		// Receive velocity1
		System.out.println("Enter in your ending velocity as meters/second");
		velocity1 = input.nextDouble();
		
		
		// Receive the time
		System.out.println("Enter in the time it took between velocities");
		time = input.nextDouble();
		
		
		// Calculations
		acceleration = (velocity1 - velocity2) / time;
		System.out.println("Your acceleration is: " + acceleration);
		
		
		
	}

}
