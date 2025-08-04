import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * The test class ChampionshipTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChampionshipTest {
    Shoes shoe;
    Shoes shoe2;
    Championship championship;
    Racket racket;
    Racket racket2;
    TennisPlayer tennisplayer;
    TennisPlayer tennisplayer2;
    
    /*
     * Default constructor for test class ChampionshipTest
     */
    public ChampionshipTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        Racket.initializeMaps();
        championship = Championship.getInstance();
        shoe = new Damped("Air Zoom Vapor Pro", 42, 5);
        shoe2=new Damped("Vapor Lite", 42, 3);
        racket = new PowerfulRacket("Head Radical", 260, 680, 680, StringingStyle.Abierto);
        racket2 = new PowerfulRacket("Wilson Blade", 260, 690, 680, StringingStyle.Abierto);
        tennisplayer = new PickguardPlayer("Novak Djokovic", shoe, 90.0, 80.0, 1, "Serbia", 42);
        tennisplayer2 = new VolleyerPlayer("Daniil Medvedev", shoe2, 79.0, 68.0, 2, "Rusia", 42);
       
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
        championship.reset();
    }

    @Test
    public void test_shoesList() {
        assertEquals(0, championship.getNumberOfShoes());
        championship.shoesList(shoe);
        assertEquals(1, championship.getNumberOfShoes());
        championship.shoesList(shoe);
        assertEquals(2, championship.getNumberOfShoes());
    }

    @Test
    public void test_racketSet() {
        assertEquals(0, championship.getNumberOfRacket());
        championship.racketSet(racket);
        assertEquals(1, championship.getNumberOfRacket());
        championship.racketSet(racket);
        assertEquals(1, championship.getNumberOfRacket());

    }

    @Test
    public void test_enroll() {
        assertEquals(0, championship.getNumberOfCompetitors());
        Shoes z1 = new Damped("Air Zoom Vapor Pro", 42, 5);
        championship.enroll(tennisplayer);
        assertEquals(1, championship.getNumberOfCompetitors());
        championship.enroll(tennisplayer);
        assertEquals(2, championship.getNumberOfCompetitors());
    }

    @Test
    public void test_assignrackets() throws RacketException {
        championship.racketSet(racket);
        championship.racketSet(racket2);
        championship.shoesList(shoe);
        tennisplayer.enroll();
        championship.assignRackets();
        assertEquals(racket2, tennisplayer.getRacket());
    }

    @Test
    public void test_showChampionship() {
        tennisplayer.enroll();
        tennisplayer2.enroll();
        championship.showChampionship();
        assertEquals("Novak Djokovic",championship.getChampionshipCompetitors().get(0).getName());

    }
}
