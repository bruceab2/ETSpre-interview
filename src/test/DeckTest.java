import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bruce on 3/24/17.
 */
public class DeckTest {

    public static final int MAX_DECK_SIZE = 52;
    Deck testDeck;

    @Before
    public void setUp() throws Exception {
        testDeck = new Deck();
    }

    /**
     * Tests if it is not false for 52 times then tests if the deck is empty.
     * @throws Exception
     */
    @Test
    public void isEmpty() throws Exception {
        for (int i = 0; i < MAX_DECK_SIZE; i++) {
            assertFalse(testDeck.isEmpty());
            testDeck.dealOneCard();
        }
        assertTrue(testDeck.isEmpty());
    }

    /**
     * Tests if it is not equal to null then equal to null when there is no card to deal.
     * @throws Exception
     */
    @Test
    public void dealOneCard() throws Exception {
        for (int i = 0; i < MAX_DECK_SIZE; i++) {
            assertNotEquals(null, testDeck.dealOneCard());
        }
        assertEquals(null, testDeck.dealOneCard());
    }

}