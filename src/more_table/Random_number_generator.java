package more_table;
/*
 * Zachary Moncur
 */
import java.util.Scanner;

public class Random_number_generator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)(System.currentTimeMillis() % 10);
		int num2 = (int)(System.currentTimeMillis() /7 % 10);
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println("What is the sum?");
		int sum;
		sum = input.nextInt();
		
		int answer;
		answer = num1 + num2;
		
		if (sum == answer) {
			System.out.println("That is the correct answer");
		}
		else {
			System.out.println("That is not the correct answer");
			System.out.println("The correct answer is: " +answer);
		}
		
			System.out.println();
		
		int num3 = (int)(System.currentTimeMillis() % 10);
		int num4 = (int)(System.currentTimeMillis() /7 % 10);
		
		System.out.println(num3);
		System.out.println(num4);
		
		System.out.println("What is the difference?");
		int difference;
		difference = input.nextInt();
		
		int answer2;
		answer2 = num3 - num4;
		
		if (difference == answer2) {
			System.out.println("That is the correct answer");
		}
		else {
			System.out.println("That is not the correct answer");
			System.out.println("The correct answer is: " +answer2);
		
		
	}

	}


	}


