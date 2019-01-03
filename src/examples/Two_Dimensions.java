package examples;
import java.util.Scanner;
/*
 * Zachary Moncur
 */
public class Two_Dimensions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Just add more [] to produce more dimensions
		int table [][] = new int [3][4];
		
		int t;
		int i;
		for (t = 0; t < 3; ++t) {
			for (i = 0; i < 4; ++i) {
				table [t] [i] = (t*3) + i + 1;
				System.out.println(table [t][i] + " ");
			}
			System.out.println();
		}
			int list [] [] = new int [7] [];
			list [0] = new int [1];
			list [1] = new int [2];
			list [2] = new int [3];
			list [0][0] = 1;
			list [0][1] = 5;
			list [0][2] = 9;
			list [1][0] = 2;
			list [1][1] = 6;
			list [1][2] = 10;
			list [2][0] = 3;
			list [2][1] = 7;
			list [2][2] = 11;
			list [3][0] = 4;
			list [3][1] = 8;
			list [3][2] = 12;
	}
}
