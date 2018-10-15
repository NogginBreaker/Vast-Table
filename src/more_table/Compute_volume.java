package more_table;

import java.util.Scanner;

public class Compute_volume {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		//Variables
		double length;
		double volume;
		double radius;
		double area;
		final double pi;
		
		pi = 3.14;
		
		//Gathering input
		System.out.println("Enter the radius");
		radius = input.nextDouble();
		System.out.print("Enter the length");
		length = input.nextDouble();
		//Don't know what's going on here, but in the console it wont let you move down one
		
		//Calculations 
		area = radius*radius*pi;
		volume = area*length;
		
		System.out.println("Your volume is: " +volume);
		

	}

}
