package examples;
import java.util.Scanner;
public class While_loop {

	public static void main(String[] args) {

		int hp = 10;
		int trolls = 0;
		int damage = 3;
		
		while (hp > 0) {
			trolls ++;
			hp = hp - damage;
			System.out.println("Your hero swings his sword and defeats an \n"
							 + "evil troll, but takes " +damage+ " damage points");
			System.out.println("Your hero has " +hp+ " hit points remaining");
		if (hp < 0) {
			System.out.println("Your hero fought valiantly and defeated " +trolls+ " trolls");
		}
		}
		
		int sum = 0;
		int i = 1;
		while (i < 10) {
			sum = sum + i;
			i++;
		}
		
		
	}

}
