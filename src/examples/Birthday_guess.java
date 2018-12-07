package examples;
import java.util.Scanner;
// Zachary Moncur
// 11/9
public class Birthday_guess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Variables
		final int NUM128 = 128;
		final int NUM64 = 64;
		final int NUM32 = 32;
		final int NUM16 = 16;
		final int NUM8 = 8;
		final int NUM4 = 4;
		final int NUM2 = 2;
		final int NUM1 = 1;
		
		String set1 = "";
		String set2 = "";
		String set3 = "";
		String set4 = "";
		String set5 = "";
		
		// Input number
		int inputnum;
		
		// Conversion placeholder
		int whatsLeft;
		
		for(int i = 0 ; i < 31; i++) {
			String biannum = "";
			System.out.println("Enter a number between 0 and 255");
			inputnum = input.nextInt();
		
		// Initialize what's Left variable
		whatsLeft = inputnum;
		
		// Creating binary number in String format
		if (inputnum >= NUM128) {
			whatsLeft = inputnum - NUM128;
			biannum = biannum + "1";
		}
		else {
			biannum = biannum + "0";
		}
		if (whatsLeft >= NUM64) {
			whatsLeft = inputnum - NUM64;
			biannum = biannum + "1";
		}
		else {
			biannum = biannum + '0'
;		}
		if (whatsLeft >= NUM32) {
			whatsLeft = inputnum - NUM32;
			biannum = biannum + "1";
		}
		else {
			biannum = biannum + "0";
		}
		if (whatsLeft >= NUM16) {
			whatsLeft = inputnum - NUM16;
			biannum = biannum + "1";
		}
		else {
			biannum = biannum + "0";
		}
		if (whatsLeft >= NUM8) {
			whatsLeft = inputnum - NUM8;
			biannum = biannum + "1";
		}
		else {
			biannum = biannum + "0";
		}
		if (whatsLeft >= NUM4) {
			whatsLeft = inputnum - NUM4;
			biannum = biannum + "1";
		}
		else {
			biannum = biannum + "0";
		}
		if (whatsLeft >= NUM2) {
			whatsLeft = inputnum - NUM2;
			biannum = biannum + "1";
		}
		else {
			biannum = biannum + "0";
		}
		if (whatsLeft >= NUM1) {
			whatsLeft = inputnum - NUM1;
			biannum = biannum + "1";
		}
		else {
			biannum = biannum + "0";
		}
		
		// Display
		System.out.println("The binary number for " +inputnum+ " is " + biannum );
		
		// Check indexing of binary number
		char xnum7 = biannum.charAt(7);
		char xnum6 = biannum.charAt(6);
		char xnum5 = biannum.charAt(5);
		char xnum4 = biannum.charAt(4);
		char xnum3 = biannum.charAt(3);
		
		// Assign to sets
		if (xnum7 == '1') {
			set1 = set1 +inputnum;
		}
		if (xnum6 == '1') {
			set2 = set2 +inputnum;
		}
		if (xnum5 == '1') {
			set3 = set3 +inputnum;
		}
		if (xnum4 == '1') {
			set4 = set4 +inputnum;
		}
		if (xnum3 == '1') {
			set5 = set5 +inputnum;
		}
		
		// Display
		System.out.println("set1 is: "+set1);
		System.out.println("set2 is: "+set2);
		System.out.println("set3 is: "+set3);
		System.out.println("set4 is: "+set4);
		System.out.println("set5 is: "+set5);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
