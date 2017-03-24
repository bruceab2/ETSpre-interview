/**
 * Created by bruce on 3/24/17.
 */
public class Card {

    public static final String[] SUIT = {"SPADES", "HEARTS", "DIAMONDS", "CLUBS"};
    public static final int NUM_SUITS = 4;
    public static final int NUM_RANKS = 13;
    public static final String[] CARD_NAMES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    /**
     * Checks to see if the card is a valid card.
     *
     * @return
     */
    public boolean cardIsValid() {
        if (rank < 0 && rank > NUM_RANKS) {
            return false;
        }

        for (int indexOfSuit = 0; indexOfSuit < SUIT.length; indexOfSuit++) {
            if (suit.equals(SUIT[indexOfSuit])) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return CARD_NAMES[rank] + " of " + suit;
    }
}