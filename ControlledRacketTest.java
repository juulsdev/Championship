import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * The test class ControlledRacketTest.
 *
 * 
 */
public class ControlledRacketTest {
    Racket racket;

    /**
     * Default constructor for test class ControlledRacketTest
     */
    public ControlledRacketTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        Racket.initializeMaps();
        racket = new ControlledRacket("Babolat Drive", 340, 740, 600, StringingStyle.Cerrado);
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

        assertEquals(25.0, racket.calculateControl(), 0.1);
    }

    @Test
    public void test_calculateSpeed() {
        assertEquals(2.4, racket.calculateSpeed(), 0.1);
    }
}
