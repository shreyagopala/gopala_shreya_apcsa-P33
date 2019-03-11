import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	//private List<Card> cards;
	private Card[] cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	/*public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		for(int i = 0; i < ranks.length; i++){
	          size++;
	          Card addCard = new Card(ranks[i], suits[i], values[i]);
	          cards.add(addCard);
	}
		shuffle();
	}*/
	public Deck(String[] ranks, String[] suits, int[] values)
	{
		cards = new Card[ranks.length*suits.length];
		System.out.println(ranks.length + " " + suits.length + " " + values.length);
		for (int i=0; i < ranks.length; i++)
		{
			for (int j = 0; j<suits.length; j++)
			{
				int cardIndex = (suits.length)*i+j;
				System.out.println(i + " " + j + " " + cardIndex);
				cards[cardIndex] = new Card(ranks[i], suits[j], values[i]);
			}
		}
		size = cards.length;
		System.out.println(Arrays.deepToString(cards));
		shuffle();
	}
	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if (size == 0) return true;
		else return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		for (int k = cards.length - 1; k > 0; k--)
		{
			int howMany = k+1;
			int start = 0;
			int randPos = (int) (Math.random() * howMany) + start;
			Card temp = cards[k];
			cards[k] = cards[randPos];
			cards[randPos] = temp;
			size = cards.length;
		}
	}
		
/*public void shuffle() {		
		size = 0;
		for( int k = size - 1; k >= 0; k-- ) {
            int r = (int)(Math.random() * k);
            Card tmp = cards.get(r);
            cards.set(r, cards.get(k));
            cards.set(k, tmp);

	}
	/*}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
	if (size > 0){
			int index = size - 1;
			size--;
			//return cards.get(index);
			return cards[index];
		}
	else return null;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			//rtn = rtn + cards.get(k);
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		//for (int k = cards.size() - 1; k >= size; k--) {
			//rtn = rtn + cards.get(k);
		for (int k = cards.length - 1; k >= size; k--)
		{ rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			//if ((k - cards.size()) % 2 == 0) {
			if ((k - cards.length)%2==0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
