
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class VolleyerPlayerTest {
    Shoes shoe;
    Shoes shoe2;
    Shoes shoe3;
    TennisPlayer tennisplayer;
    TennisPlayer tennisplayer2;
    Racket racket;
    Racket racket2;
    List<Shoes> championshipShoes;

    /**
     * Default constructor for test class WithGripTest
     */
    public VolleyerPlayerTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        Racket.initializeMaps();
        shoe = new Damped("Air Zoom Vapor Pro", 42, 5);
        shoe2 = new Damped("K-Swiss Express", 42, 3);
        shoe3 = new Damped("Vapor Lite", 42, 3);
        tennisplayer = new PickguardPlayer("Novak Djokovic", shoe, 90.0, 80.0, 1, "Serbia", 42);
        tennisplayer2 = new VolleyerPlayer("Daniil Medvedev", shoe2, 79.0, 68.0, 2, "Rusia", 42);
        racket = new BalancedRacket("Head Graphene", 320, 690, 630, StringingStyle.Abierto, 6, 2);
        racket2 = new ControlledRacket("Wilson Silver", 220, 690, 650, StringingStyle.Abierto);
        championshipShoes = new ArrayList<Shoes>();
        Shoes z9 = new Damped("Lotto Space", 40, 5);
        Shoes z10 = new Damped("K-Swiss Express", 42, 3);
        Shoes z11 = new Damped("Babolat Jet Tere", 42, 5.5);
        Shoes z12 = new Damped("Lotto Mirage", 40, 6);
        Shoes z13 = new Damped("K-Swiss Hypercourt", 40, 5);
        Shoes z14 = new Damped("Wilson Rush", 42, 3.5);
        Shoes z15 = new Damped("Head Revolt", 40, 5);
        Shoes z16 = new WithGrip("Joma Slam", 40, 3);
        Shoes z17 = new WithGrip("Adidas Gamecourt", 40, 5);
        Shoes z18 = new WithGrip("Asics Gel-Game", 42, 4.5);
        Shoes z19 = new WithGrip("Asics Solution", 42, 3);
        Shoes z20 = new WithGrip("Nike Air Zoom", 40, 5);
        Shoes z21 = new WithGrip("Nike Zoom Vapor", 42, 4);
        Shoes z22 = new WithGrip("Wilson Kaos", 41, 5);
        Shoes z23 = new WithGrip("Head Revolt Pro", 42, 4.5);

        championshipShoes.add(z9);
        championshipShoes.add(z10);
        championshipShoes.add(z11);
        championshipShoes.add(z12);
        championshipShoes.add(z13);
        championshipShoes.add(z14);
        championshipShoes.add(z15);
        championshipShoes.add(z16);
        championshipShoes.add(z17);
        championshipShoes.add(z18);
        championshipShoes.add(z19);
        championshipShoes.add(z20);
        championshipShoes.add(z21);
        championshipShoes.add(z22);
        championshipShoes.add(z23);

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
    public void test_play() {
        tennisplayer.setRacket(racket);
        tennisplayer2.setRacket(racket2);
        tennisplayer2.play(tennisplayer);
        assertEquals(33280, tennisplayer.getAccumulatedPoints(), 0.1);
    }

    @Test
    public void test_chooseshoes() {
        tennisplayer2.setRacket(racket2);
        tennisplayer2.chooseShoes();
        Shoes sh = tennisplayer2.getShoes();
        assertEquals(sh, tennisplayer2.getShoes());

    }
}
