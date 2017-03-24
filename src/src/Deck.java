import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by bruce on 3/24/17.
 */
public class Deck {



    List<Card> cards;

    /**
     * Creates a shuffled deck of 52 playing cards.
     */
    public Deck() {
        this.cards = new ArrayList<>();
        for (int indexOfSuit = 0; indexOfSuit < Card.NUM_SUITS; indexOfSuit++) {
            for (int rank = 0; rank < Card.NUM_RANKS; rank++) {
                cards.add(new Card(rank, Card.SUIT[indexOfSuit]));
            }
        }
        shuffle();
    }

    /**
     * Checks if the deck is empty
     *
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    /**
     * Deals a card from the deck and removes it from the deck.
     *
     * @return the drawn card or if deck is empty null
     */
    public Card dealOneCard() {
        if (cards.isEmpty()) {
            return null;
        } else {
            return cards.remove(cards.size() - 1);
        }
    }

    /**
     * Shuffle the cards remaining in the deck.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }
}