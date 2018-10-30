package more_table;
import java.util.Scanner;
/*
 * Zachary Moncur
 * 10/15
 */
public class Calculating_energy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double water_weight;
		double initial_water_temp;
		double final_water_temp;
		double energy;
		
		System.out.println("Enter your amount of water in kilograms");
		water_weight = input.nextDouble();
		
		System.out.println("Enter your initial temperature in celsius");
		initial_water_temp = input.nextDouble();
		
		System.out.println("Enter the final temperature in celsius");
		final_water_temp = input.nextDouble();
		
		energy = water_weight*(final_water_temp - initial_water_temp)*4184;
		System.out.println("The energy needed was: "
							+ energy + "joules");

	}

}
