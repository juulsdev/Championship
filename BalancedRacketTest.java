

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BalancedRacketTest.
 *
 *
 */
public class BalancedRacketTest {

    Racket racket;

    /**
     * Default constructor for test class BalancedRacketTest
     */
    public BalancedRacketTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        Racket.initializeMaps();
        racket = new BalancedRacket("Prince Hornet 100", 220, 690, 600, StringingStyle.Cerrado, 2.5, 4);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void test_calculatePower() {

        assertEquals(10.0, racket.calculatePower(), 0.1);
    }

    @Test
    public void test_calculateControl() {

        assertEquals(40.0, racket.calculateControl(), 0.1);
    }

    @Test
    public void test_calculateSpeed() {

        assertEquals(10.0, racket.calculateSpeed(), 0.1);
    }
}
