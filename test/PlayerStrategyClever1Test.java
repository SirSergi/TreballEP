/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author p4790084
 */
public class PlayerStrategyClever1Test {
    
    private StrategyComponent cleaver1;
    private ArrayList<Boolean> enemyDecision = new ArrayList<Boolean>();
    private ArrayList<Boolean> enemyDecision2 = new ArrayList<Boolean>();
    private ArrayList<Boolean> enemyDecision3 = new ArrayList<Boolean>();
    private ArrayList<Boolean> enemyDecision4 = new ArrayList<Boolean>();

    @Before
    public void setUp(){
        cleaver1 = new PlayerStrategyClever1();
    }
    @Test
    public void cleaverEmptyTest(){
        assertEquals(cleaver1.getDecision(enemyDecision),false);
    }
    @Test
    public void cleaverNotBetrayedTest(){
        cleaver1.getDecision(enemyDecision);
        enemyDecision.add(Boolean.FALSE);
        cleaver1.getDecision(enemyDecision);
        enemyDecision.add(Boolean.FALSE);
        assertEquals(cleaver1.getDecision(enemyDecision),true);
    }
    @Test
    public void cleaverBetrayedOnceTest(){
        cleaver1.getDecision(enemyDecision2);
        enemyDecision2.add(Boolean.FALSE);
        cleaver1.getDecision(enemyDecision2);
        enemyDecision2.add(Boolean.FALSE);
        cleaver1.getDecision(enemyDecision2);
        enemyDecision2.add(Boolean.TRUE);
        assertEquals(cleaver1.getDecision(enemyDecision2),false);
    }
    @Test
    public void cleaverBetrayedPunishWithForgivenTest(){
        cleaver1.getDecision(enemyDecision3);
        enemyDecision3.add(Boolean.TRUE);
        cleaver1.getDecision(enemyDecision3);
        enemyDecision3.add(Boolean.TRUE);
        cleaver1.getDecision(enemyDecision3);
        enemyDecision3.add(Boolean.FALSE);
        assertEquals(cleaver1.getDecision(enemyDecision3),true);
    }
    @Test
    public void cleaverLastDecisionFalseAndBetrayedOnceAfterPunishEndTest(){
        cleaver1.getDecision(enemyDecision4);
        enemyDecision4.add(Boolean.TRUE);
        cleaver1.getDecision(enemyDecision4);
        enemyDecision4.add(Boolean.TRUE);
        cleaver1.getDecision(enemyDecision4);
        enemyDecision4.add(Boolean.FALSE);
        cleaver1.getDecision(enemyDecision4);
        enemyDecision4.add(Boolean.FALSE);
        assertEquals(cleaver1.getDecision(enemyDecision4),false);
    }
   
}
