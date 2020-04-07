import java.util.ArrayList;
import java.util.*;

public class Hand {

	private ArrayList<Card> hand;

	public Hand() {
		hand = new ArrayList<Card>();
	}

	public void addCard(Card c) {
		if (c != null)
			hand.add(c);
	}

	public int getCardCount() {
		return hand.size();
	}

	public Card getCard(int position) {
		if (position >= 0 && position < hand.size())
			return (Card) hand.get(position);
		else
			return null;
	}

	
}
