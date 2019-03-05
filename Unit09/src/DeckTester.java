/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		 	String[] ranks1 = {"Jack", "Queen", "King"};
			String[] suits1 = {"Hearts", "Spades", "Diamonds"};
			int[] values1 = {11, 12, 13};
			Deck deck1 = new Deck(ranks1, suits1, values1);
			System.out.println("Size of Deck1: " + deck1.size());
			
			String[] ranks2 = {"10", "Queen", "King"};
			String[] suits2 = {"Clubs", "Spades", "Diamonds"};
			int[] values2 = {10, 12, 13};
			Deck deck2 = new Deck(ranks2, suits2, values2);
			System.out.println("Deck2 is empty: " + deck2.isEmpty());
			
			String[] ranks3 = {"Ace", "3", "Queen"};
			String[] suits3 = {"Diamonds", "Spades", "Hearts"};
			int[] values3 = {1, 3, 12};
			Deck deck3 = new Deck(ranks3, suits3, values3);
			System.out.println("Dealt card: " + deck3.deal());
	}
}
