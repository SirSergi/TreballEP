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
public class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player();
    }

    @Test
    public void PlayerSetStrategyTest() {
        player.setStrategy(new PlayerStrategyPerChulaJo());
        assertEquals(player.getStrategy().getDecision(null), new PlayerStrategyPerChulaJo().getDecision(null));
    }

    @Test
    public void PlayerSetEnemyDecisionTest() {
        player.addDecision(false);
        player.addDecision(true);
        assertEquals(player.getDecisions().size(), 2);


    }
}
