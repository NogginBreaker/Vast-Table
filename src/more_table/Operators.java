package more_table;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
		i=i++;
		System.out.println(i);
		int x=i;
		System.out.println(x);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value that will fit in a byte -128 to 127");
		
		byte byteValue = input.nextByte();
		byte minusAByte = (byte) (byteValue - byteValue);
		byte addAByte = (byte) (byteValue + byteValue);
		byte xAByte = (byte) (byteValue * byteValue);
		byte divideAByte = (byte) (byteValue / byteValue);
		
		System.out.println(minusAByte);
		System.out.println(addAByte);
		System.out.println(xAByte);
		System.out.println(divideAByte);
		
		System.out.println("Enter a value that will fit in a double");
		double doubleValue = input.nextDouble();
		System.out.println("Enter a value that will fit in an int");
		int intValue = input.nextInt();
		double intdev = (doubleValue) %intValue;
		System.out.println(intdev);

	}

}
