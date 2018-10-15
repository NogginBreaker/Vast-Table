package more_table;

import java.util.Scanner;

public class Compute_average_classes {

	public static void main(String[] args) {
		final boolean A_B = false;
		final boolean B_B = false;
		final boolean C_B = false;
		final boolean D_B = false;
		final boolean F_B = false;
			//Get the users scores
			// Sum all scores
			//Divide by total
			// Display average
			
			Scanner input = new Scanner(System.in);
			
			//Classes
			double creative_writing;
			double english;
			double chemistry;
			double robotics;
			double math;
			double seminary;
			double history;
			double programming;
			double sum;
			double avg;
			double gpa;
			
			boolean B_creative_writing;
			boolean B_english;
			boolean B_chemistry;
			boolean B_robotics;
			boolean B_math;
			boolean B_seminary;
			boolean B_history;
			boolean B_programming;
			
			//Grades
			int A;
			int B;
			int C;
			int D;
			int F;

			
			A = 100;
			A = 90;
			B = 80;
			C = 70;
			D = 60;
			F = 50;
			
			//Display the question
			System.out.println("Enter the grades (percentages) from your classes");
			
			creative_writing = input.nextDouble();
			english = input.nextDouble();
			chemistry = input.nextDouble();
			robotics = input.nextDouble();
			math = input.nextDouble();
			seminary = input.nextDouble();
			history = input.nextDouble();
			programming = input.nextDouble();
			
			//Calculate the sum
			sum = creative_writing+english+chemistry+robotics+
					math+seminary+history+programming;
				
			//Calculate the average 
			avg = sum / 8;
			
			//Calculate gpa
			if (B_creative_writing = A_B ) {
				System.out.println("You got an A in creative writing");
			}
			else if (B_creative_writing = B_B) {
				System.out.println("You got a B in creative writing");
			}
			else if (B_creative_writing = C_B) {
				System.out.println("You got a C in creative writing");
			}
			else if (B_creative_writing = D_B) {
				System.out.println("You got a D in creative writing");
			}
			else if (B_creative_writing = F_B) {
				System.out.println("You got an F in creative writing");
			}
			//
			if (B_english = A_B ) {
				System.out.println("You got an A in creative writing");
			}
			else if (B_english = B_B) {
				System.out.println("You got a B in creative writing");
			}
			else if (B_english = C_B) {
				System.out.println("You got a C in creative writing");
			}
			else if (B_english = D_B) {
				System.out.println("You got a D in creative writing");
			}
			else if (B_english = F_B) {
				System.out.println("You got an F in creative writing");
			}	
			//
			if (B_chemistry = A_B ) {
				System.out.println("You got an A in creative writing");
			}
			else if (B_chemistry = B_B) {
				System.out.println("You got a B in creative writing");
			}
			else if (B_chemistry = C_B) {
				System.out.println("You got a C in creative writing");
			}
			else if (B_chemistry = D_B) {
				System.out.println("You got a D in creative writing");
			}
			else if (B_chemistry = F_B) {
				System.out.println("You got an F in creative writing");
			}	
			//
			if (B_robotics = A_B ) {
				System.out.println("You got an A in creative writing");
			}
			else if (B_robotics = B_B) {
				System.out.println("You got a B in creative writing");
			}
			else if (B_robotics = C_B) {
				System.out.println("You got a C in creative writing");
			}
			else if (B_robotics = D_B) {
				System.out.println("You got a D in creative writing");
			}
			else if (B_robotics = F_B) {
				System.out.println("You got an F in creative writing");
			}	
			//
			if (B_math = A_B ) {
				System.out.println("You got an A in creative writing");
			}
			else if (B_math = B_B) {
				System.out.println("You got a B in creative writing");
			}
			else if (B_math = C_B) {
				System.out.println("You got a C in creative writing");
			}
			else if (B_math = D_B) {
				System.out.println("You got a D in creative writing");
			}
			else if (B_math = F_B) {
				System.out.println("You got an F in creative writing");
			}	
			//
			if (B_seminary = A_B ) {
				System.out.println("You got an A in creative writing");
			}
			else if (B_seminary = B_B) {
				System.out.println("You got a B in creative writing");
			}
			else if (B_seminary = C_B) {
				System.out.println("You got a C in creative writing");
			}
			else if (B_seminary = D_B) {
				System.out.println("You got a D in creative writing");
			}
			else if (B_seminary = F_B) {
				System.out.println("You got an F in creative writing");
			}	
			//
			if (B_history = A_B ) {
				System.out.println("You got an A in creative writing");
			}
			else if (B_history = B_B) {
				System.out.println("You got a B in creative writing");
			}
			else if (B_history = C_B) {
				System.out.println("You got a C in creative writing");
			}
			else if (B_history = D_B) {
				System.out.println("You got a D in creative writing");
			}
			else if (B_history = F_B) {
				System.out.println("You got an F in creative writing");
			}	
			//
			if (B_programming = A_B ) {
				System.out.println("You got an A in creative writing");
			}
			else if (B_programming = B_B) {
				System.out.println("You got a B in creative writing");
			}
			else if (B_programming = C_B) {
				System.out.println("You got a C in creative writing");
			}
			else if (B_programming = D_B) {
				System.out.println("You got a D in creative writing");
			}
			else if (B_programming = F_B) {
				System.out.println("You got an F in creative writing");
			}	
			
			
			//Display the total
			System.out.println("Your average grade is: "+ avg);
			
			//To get gpa you need to assign each number their value, and then you need to use a long if else statement for each subject

	}

}
