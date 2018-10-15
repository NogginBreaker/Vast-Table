package more_table;

import static java.lang.System.out;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		int quaters;
		int dimes;
		int nickles;
		int cents;
		int total;
		int remainder;
		boolean greaterThan4;
		
		out.println("How much change is left in your pocket");
		Scanner input = new Scanner(System.in);
		total = input.nextInt();
		
		quaters = total / 25;
		remainder = total % 25;
		
		dimes = total / 10;
		remainder = total % 10;
		
		nickles = total / 5;
		remainder = total % 5;
		
		cents = total / 1;
		remainder = total % 1;
		
		out.println("From " +total+ " cents you have");
		out.println("Quaters: "+quaters+" Dimes: "+dimes+" Nickels: "+nickles+ " Cents: "+cents+"");
		
		greaterThan4 = quaters >=4;
		out.println(greaterThan4);

	}

}
