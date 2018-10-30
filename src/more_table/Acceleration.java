package more_table;
import java.util.Scanner;
/*
 * Zachary Moncur
 * 10/15
 */
public class Acceleration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double velocity1;
		double velocity2;
		double time;
		double acceleration;
		
		System.out.println("Enter in your starting velocity as meters/second");
		velocity2 = input.nextDouble();
		
		System.out.println("Enter in your ending velocity as meters/second");
		velocity1 = input.nextDouble();
		
		System.out.println("Enter in the time it took between velocities");
		time = input.nextDouble();
		
		acceleration = (velocity1 - velocity2) / time;
		System.out.println("Your acceleration is: " + acceleration);
	}

}
