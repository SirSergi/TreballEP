/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author p4790084
 */
public class PlayTest {

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
    }

    @Test
    public void PlaySetStrategyTest() {
        game.setPlayerStrategy(player1, new PlayerStrategyCandida());
        assertEquals(player1.playerDecision(), true);

    }

    @Test
    public void PlaySimulateMatchTest() {
        game.setPlayerStrategy(player1, new PlayerStrategyCandida());
        game.setPlayerStrategy(player2, new PlayerStrategyPerChulaJo());
        int[] score = game.simulateMatch();
        int[] spectedScore = {0, 30};
        assertEquals(score[0] == spectedScore[0] && score[1] == spectedScore[1], true);

    }
}
