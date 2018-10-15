package more_table;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Variables
		double pounds;
		double kilograms;
		double inches;
		double meters;
		int age;
		double bmi;
		
		//Receive input
		System.out.println("What is your weight in pounds?");
		pounds = input.nextDouble();
		kilograms = pounds*0.454;
		
		System.out.println("What is your height in inches?");
		inches = input.nextDouble();
		meters = inches*0.0254;
		
		System.out.println("How old are you?");
		age = input.nextInt();
		
		bmi = kilograms / (meters*meters);
		
		
		//If statements
		
		//
		if (age < 12 ) {
			if (bmi < 15) {
				System.out.println("Your bmi: "+bmi+" means youre underweight");
			}
			else if (bmi < 17) {
				System.out.println("Your bmi: "+bmi+" means youre normal");
			}
			else if (bmi < 24) {
				System.out.println("Your bmi: "+bmi+" means youre overweight");
			}
			else {
				System.out.println("Your bmi: "+bmi+" means youre obese");
			}
			}
		//
		else if (age <= 17) {
			if (bmi < 14) {
				System.out.println("Your bmi: "+bmi+" means youre underweight");
			}
			else if (bmi <= 21) {
				System.out.println("Your bmi: "+bmi+" means youre normal");
			}
			else if (bmi <= 26) {
				System.out.println("Your bmi: "+bmi+" means youre overweight");
			}
			else if (bmi <= 27) {
				System.out.println("Your bmi: "+bmi+" means youre obese");
			}

		
			}
		else  {
				if (bmi < 18.5) {
					System.out.println("Your bmi: "+bmi+" means youre underweight");
				}
				else if (bmi <= 18.5) {
					System.out.println("Your bmi: "+bmi+" means youre normal");
				}
				else if (bmi <= 25) {
					System.out.println("Your bmi: "+bmi+" means youre overweight");
				}
				else if (bmi <= 30) {
					System.out.println("Your bmi: "+bmi+" means youre obese");
				}
			}
		
	}
}
		
		
		
		
	



