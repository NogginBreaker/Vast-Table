package examples;
import java.util.Scanner;
public class Method_Examples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		template(input);
	}
// Methods
	public static void template(Scanner input) {
		
		// Answer Check
		String answer = "";
		while (answer.equals("")) {
		System.out.println("Would you like to go to the forest the house or the lake");
		answer = input.nextLine();
		if (answer.equals("forest") || answer.equals("house") || answer.equals("lake")) {
			break;
		}
		else {
			System.out.println("That's not a good response");
		}
		}
		
		// Check Response
		switch (answer) {
		case "forest":
			//forest(input);
			break;
		case "house":
			//house(input);
		case "lake":
			//lake(input);
			break;
		}
		
		
		
		

	}

}
