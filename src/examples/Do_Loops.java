package examples;
import java.util.Scanner;
public class Do_Loops {

	public static void main(String[] args) {
		// Do loops will do whatever is in the loop, it doesn't need a true or false 
		int data, sum;
		sum = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
			sum += data;
		} 
		while (data != 0); {
			System.out.println("The sum is: "+sum);
		}
		
		
		
		
		
	}

}
