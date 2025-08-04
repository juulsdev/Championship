
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class WithGripTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WithGripTest {
    Shoes shoe;

    /**
     * Default constructor for test class WithGripTest
     */
    public WithGripTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        shoe = new Damped("Air Zoom Vapor Pro", 42, 5);
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
    public void test_calculateServeValue() {
        assertEquals(10.8, shoe.calculateServeValue(), 0.1);
    }

    @Test
    public void test_calculateRemainderValue() {
        assertEquals(6.5, shoe.calculateRemainderValue(), 0.1);
    }
}
