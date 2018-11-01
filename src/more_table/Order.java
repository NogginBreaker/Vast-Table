package more_table;
import java.util.Scanner;
public class Order {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// String Variables
		String city1;
		String city2;
		String temp;
		
		// Gathering city1 input
		System.out.println("Enter the name of a city");
		city1 = input.nextLine();
		
		
		// Gathering city2 input
		System.out.println("Enter the name of a second city");
		city2 = input.nextLine();
		
		
		// Comparison 
		if (city1.compareTo(city2)<0) {
			System.out.println("The cities, in alphabetical order are " +
								city1 + " " + city2);
		}
		else {
			System.out.println("The citites, in alphabetical order are " +
								city2 + " " + city1);
		}
		
		
		
		
		
		
	}

}
