package more_table;
import java.util.Scanner;
/*
 * Zachary Moncur
 * 10/17
 */
public class Days_of_the_Week {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Receiving input
		System.out.println("Enter in a day");
		int day = input.nextInt();
		
		int Sunday = 0;
		int Monday = 1;
		int Tuesday = 2;
		int Wednesday = 3;
		int Thursday = 4;
		int Friday = 5;
		int Saturday = 6;
		
		if (day == 0) {
		System.out.println("Today is Sunday");
		}
		if (day == 1) {
		System.out.println("Today is Monday");
		}
		if (day == 2) {
		System.out.println("Today is Tuesday");
		}
		if (day == 3) {
		System.out.println("Today is Wednesday");
		}
		if (day == 4) {
		System.out.println("Today is Thursday");
		}
		if (day == 5) {
		System.out.println("Today is Friday");
		}
		if (day == 6) {
		System.out.println("Today is Saturday");	
		}
		
		
		

	}

}
