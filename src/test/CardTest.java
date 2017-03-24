import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bruce on 3/24/17.
 */
public class CardTest {

    public static final int MAX_NUMBER_TEST = 50;

    Card testCard, notValidSuit;

    @Before
    public void setUp() throws Exception {
        testCard = new Card(0, Card.SUIT[0]);
        notValidSuit = new Card(0, "not valid");
    }

    @Test
    public void cardIsValid() throws Exception {
        for (int i = 0; i < MAX_NUMBER_TEST; i++) {
            if (i < Card.NUM_RANKS) {
                assertTrue(testCard.cardIsValid());
            } else {
                assertFalse(notValidSuit.cardIsValid());
            }
        }
    }
}