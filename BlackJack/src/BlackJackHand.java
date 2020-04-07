
public class BlackJackHand extends Hand {
	public int getCardValue() {

		int val = 0;
		boolean ace = false;
		int cards = getCardCount();

		for (int i = 0; i < cards; i++) {
			int cardVal;
			Card card = getCard(i);
			cardVal = card.getValue();
			if (cardVal > 10) {
				cardVal = 10;
			}
			if (cardVal == 1) {
				ace = true;
			}
			val = val + cardVal;
		}

		if (ace == true && val + 10 <= 21)
			val = val + 10;

		return val;

	}
}
