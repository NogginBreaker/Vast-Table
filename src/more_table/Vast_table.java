package more_table;
import java.util.Scanner; 
public class Vast_table {

	public static void main(String[] args) {
		
		//Scanner Tool
		Scanner input = new Scanner(System.in);
		
		//Speech of console
		System.out.println();
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Programming is Fun");
		System.out.println("");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("");
		System.out.println("''Give a man a fire and he'll be warm for a day. Set a man on fire and he'll be warm for the rest of his life''-me");
		System.out.println("");
		System.out.println("|______________|");
		System.out.println("|a   a^2   a^3 |");
		System.out.println("|~~~~~~~~~~~~~~|");
		System.out.println("|  1   1    1  |");
		System.out.println("|  2   4    8  |");
		System.out.println("|  3   9    27 |");
		System.out.println("|  4   16   64 |");
		System.out.println("");
		
		//Area \ Perimeter
		System.out.println("Enter the radius of your circle");
		final double PI = 3.141592653589793238462643383279502884197169399375105820974944592307816406;
		double radius;
		double area;
		double perimeter;
		radius = input.nextDouble();
		area = radius*radius*PI;
		perimeter = 2*radius*PI;
		System.out.println("The perimeter of your circle is: " + perimeter +"\"");
		System.out.println("the area of your circle is: " 
				+ area +"\"");
		
		//Kilometers per hour
		System.out.println();
		System.out.println("Enter the amount of hours");
		double time;
		time = input.nextDouble();
		double kph;
		kph = 1.6*time;
		double average_speed;
		average_speed = kph;
		System.out.println("Kilometers per hour = " +kph );

		
	}

}
