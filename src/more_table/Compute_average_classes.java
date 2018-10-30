package more_table;

import java.util.Scanner;

public class Compute_average_classes {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			//Classes
			int class1;
			int class2;
			int class3;
			int class4;
			int class5;
			int class6;
			int class7;
			int class8;
			int sum;
			int avg;
			
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
			System.out.println("Enter the grades (percentages) from your classes (8)");
			
			class1 = input.nextInt();
			class2 = input.nextInt();
			class3 = input.nextInt();
			class4 = input.nextInt();
			class5 = input.nextInt();
			class6 = input.nextInt();
			class7 = input.nextInt();
			class8 = input.nextInt();
			
			//Calculate the sum
			sum = class1+class2+class3+class4+class5+class6+class7+class8;
				
			//Calculate the average 
			avg = sum / 8;
			
			//Display the total
			System.out.println("Your average grade is: "+ avg);
			
			// Display the letter grade
			// It would have been better to use an if statement
			
			switch (avg % 100) {
			case 100:
				System.out.println("You got an A");
				break;
			case 99:
				System.out.println("You got an A");
				break;
			case 98:
				System.out.println("You got an A");
				break;
			case 97:
				System.out.println("You got an A");
				break;
			case 96:
				System.out.println("You got an A");
				break;
			case 95:
				System.out.println("You got an A");
				break;
			case 94:
				System.out.println("You got an A");
				break;
			case 93:
				System.out.println("You got an A");
				break;
			case 92:
				System.out.println("You got an A-");
				break;
			case 91:
				System.out.println("You got an A-");
				break;
			case 90:
				System.out.println("You got an A-");
				break;
			case 89:
				System.out.println("You got a B+");
				break;
			case 88:
				System.out.println("You got a B+");
				break;
			case 87:
				System.out.println("You got a B+");
				break;
			case 86:
				System.out.println("You got a B");
				break;
			case 85:
				System.out.println("You got a B");
				break;
			case 84:
				System.out.println("You got a B");
				break;
			case 83:
				System.out.println("You got a B");
				break;
			case 82:
				System.out.println("You got a B-");
				break;
			case 81:
				System.out.println("You got a B-");
				break;
			case 80:
				System.out.println("You got a B-");
				break;
			case 79:
				System.out.println("You got a C+");
				break;
			case 78:
				System.out.println("You got a C+");
				break;
			case 77:
				System.out.println("You got a C+");
				break;
			case 76:
				System.out.println("You got a C");
				break;
			case 75:
				System.out.println("You got a C");
				break;
			case 74:
				System.out.println("You got a C");
				break;
			case 73:
				System.out.println("You got a C");
				break;
			case 72:
				System.out.println("You got a C-");
				break;
			case 71:
				System.out.println("You got a C-");
				break;
			case 70:
				System.out.println("You got a C-");
				break;
			case 69:
				System.out.println("You got a D+");
				break;
			case 68:
				System.out.println("You got a D+");
				break;
			case 67:
				System.out.println("You got a D+");
				break;
			case 66:
				System.out.println("You got a D");
				break;
			case 65:
				System.out.println("You got a D");
				break;
			case 64:
				System.out.println("You got a D");
				break;
			case 63:
				System.out.println("You got a D");
				break;
			case 62:
				System.out.println("You got a D");
				break;
			case 61:
				System.out.println("You got a D");
				break;
			case 60:
				System.out.println("You got a D");
				break;
			case 59:
				System.out.println("You got a F");
				break;
			case 58:
				System.out.println("You got a F");
				break;
			case 57:
				System.out.println("You got a F");
				break;
			case 56:
				System.out.println("You got a F");
				break;
			case 55:
				System.out.println("You got a F");
				break;
			case 54:
				System.out.println("You got a F");
				break;
			case 53:
				System.out.println("You got a F");
				break;
			case 52:
				System.out.println("You got a F");
				break;
			case 51:
				System.out.println("You got a F");
				break;
			case 50:
				System.out.println("You got a F");
				break;
			case 49:
				System.out.println("You got a F");
				break;
			case 48:
				System.out.println("You got a F");
				break;
			case 47:
				System.out.println("You got a F");
				break;
			case 46:
				System.out.println("You got a F");
				break;
			case 45:
				System.out.println("You got a F");
				break;
			case 44:
				System.out.println("You got a F");
				break;
			case 43:
				System.out.println("You got a F");
				break;
			case 42:
				System.out.println("You got a F");
				break;
			case 41:
				System.out.println("You got a F");
				break;
			case 40:
				System.out.println("You got a F");
				break;
			case 39:
				System.out.println("You got a F");
				break;
			case 38:
				System.out.println("You got a F");
				break;
			case 37:
				System.out.println("You got a F");
				break;
			case 36:
				System.out.println("You got a F");
				break;
			case 35:
				System.out.println("You got a F");
				break;
			case 34:
				System.out.println("You got a F");
				break;
			case 33:
				System.out.println("You got a F");
				break;
			case 32:
				System.out.println("You got a F");
				break;
			case 31:
				System.out.println("You got a F");
				break;
			case 30:
				System.out.println("You got a F");
				break;
			case 29:
				System.out.println("You got a F");
				break;
			case 28:
				System.out.println("You got a F");
				break;
			case 27:
				System.out.println("You got a F");
				break;
			case 26:
				System.out.println("You got a F");
				break;
			case 25:
				System.out.println("You got a F");
				break;
			case 24:
				System.out.println("You got a F");
				break;
			case 23:
				System.out.println("You got a F");
				break;
			case 22:
				System.out.println("You got a F");
				break;
			case 21:
				System.out.println("You got a F");
				break;
			case 20:
				System.out.println("You got a F");
				break;
			case 19:
				System.out.println("You got a F");
				break;
			case 18:
				System.out.println("You got a F");
				break;
			case 17:
				System.out.println("You got a F");
				break;
			case 16:
				System.out.println("You got a F");
				break;
			case 15:
				System.out.println("You got a F");
				break;
			case 14:
				System.out.println("You got a F");
				break;
			case 13:
				System.out.println("You got a F");
				break;
			case 12:
				System.out.println("You got a F");
				break;
			case 11:
				System.out.println("You got a F");
				break;
			case 10:
				System.out.println("You got a F");
				break;
			case 9:
				System.out.println("You got a F");
				break;
			case 8:
				System.out.println("You got a F");
				break;
			case 7:
				System.out.println("You got a F");
				break;
			case 6:
				System.out.println("You got a F");
				break;
			case 5:
				System.out.println("You got a F");
				break;
			case 4:
				System.out.println("You got a F");
				break;
			case 3:
				System.out.println("You got a F");
				break;
			case 2:
				System.out.println("You got a F");
				break;
			case 1:
				System.out.println("You got a F");
				break;
			case 0:
				System.out.println("You got a F");
				break;
			}
			
			
			
			
	}

}
