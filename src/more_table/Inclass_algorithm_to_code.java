package more_table;
import java.util.Scanner;
public class Inclass_algorithm_to_code {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Getting the input "miles"
		double miles;
		miles = input.nextDouble();
		
		// Setting the set value of "kilometers per mile" 
		double KILOMETERS_PER_MILE;
		KILOMETERS_PER_MILE = 1.609;
		
		// Setting the kilometers / doing calculations
		final double kilometers;
		kilometers = miles*KILOMETERS_PER_MILE;
		
		// Display the result 
		System.out.println("kilometers = " + kilometers);
		

	}

}
