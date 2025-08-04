import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * The test class PowerfulRacketTest.
 *
 *
 */
public class PowerfulRacketTest {
    Racket racket;

    /**
     * Default constructor for test class PowerfulRacketTest
     */
    public PowerfulRacketTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        Racket.initializeMaps();
        racket = new PowerfulRacket("Head Radical", 260, 680, 680, StringingStyle.Abierto);
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
        assertEquals(4.0, racket.calculatePower(), 0.1);
    }

    @Test
    public void test_calculateControl() {
        assertEquals(4.0, racket.calculateControl(), 0.1);
    }

    @Test
    public void test_calculateSpeed() {
        assertEquals(12.0, racket.calculateSpeed(), 0.1);
    }
}
