
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DampedTest {

    Shoes shoe;

    public DampedTest() {
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
    public void calculateRemainderValue_test() {
        assertEquals(10.8, shoe.calculateServeValue(), 0.1);
    }

    @Test
    public void test_calculateRemainderValue() {
        assertEquals(6.5, shoe.calculateRemainderValue(), 0.1);
    }
}
