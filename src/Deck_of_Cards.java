
public class Deck_of_Cards {
/*
 * Zachary Moncur
 * 12/18/18
 */
	public static void main(String[] args) {
		
		// Building the arrays
		int[] deck = new int[52];
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Aces","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		// Math and stuff
		for (int i = 0; i < deck.length; i++) {
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		// Displaying the lads
		for (int i = 0; i < 5; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
		
		
		

	}

}
