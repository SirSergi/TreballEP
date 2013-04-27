
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author sor1
 */
public class SpectatorTest {

    private Spectator spectator = new Spectator();
    private Spectator spectator2 = new Spectator();
    private Spectator spectator3 = new Spectator();
    private Play game;
    private Player player1;
    private Player player2;
    private UtilityMatrix uMatrix;
    private int rounds = 10;

    @Before
    public void setUp() throws MatrixException {
        player1 = new Player();
        player2 = new Player();
        uMatrix = new UtilityMatrix(3, 2, 1, 0);
        game = new Play(player1, player2, uMatrix, rounds);
        game.addObserver(spectator);
        game.addObserver(spectator2);
        game.addObserver(spectator3);
    }

    @Test
    public void PlaySimulateMatchTest() {
        game.setPlayerStrategy(player1, new PlayerStrategyCandida());
        game.setPlayerStrategy(player2, new PlayerStrategyPerChulaJo());
        game.simulateMatch();
    }
}
