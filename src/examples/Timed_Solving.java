package examples;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
 // Zachary Moncur
 // 11/27
public class Timed_Solving {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Number of Questions 
		final int NUMBER_OF_QUESTIONS = 5;
		
		// Correct Count
		int correctCount = 0;
		
		// Variable that controls the loop (count the number of questions)
		int count = 0;
		
		// Used to hold a value
		String output = " ";
		
		// Timer
		long startTime = System.currentTimeMillis();		
		
		
		
		// Beginning of the loop - generate random numbers, prompt a question, swap numbers
		while (count < NUMBER_OF_QUESTIONS) {
			int number1 = (int)(Math.random() * 100);
			int number2 = (int)(Math.random() * 100);
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			System.out.println("What is "+number1+"-"+number2+"?");
			int answer = input.nextInt();
			if (number1 - number2 == answer) {
				System.out.println("You answered the question right you big Smart lad");
				correctCount++;
			}
			else {
				System.out.println("Wrong, you big Dumb lad");
				System.out.println("The answer should have been: "+ (number1 - number2));
			}
			count++;
			output += "\n"+number1+"-"+number2+" = "+answer+ ((number1 - number2 == answer) ? " correct" : " wrong");
		}
		
		
		
		// Calculate the total time 
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Correct count is: "+correctCount+"\nTest time is: "+totalTime / 1000+
						   " seconds "+output);
			
			
	}

}
