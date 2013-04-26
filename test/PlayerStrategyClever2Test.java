/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author p4790084
 */
public class PlayerStrategyClever2Test {
    
    private StrategyComponent cleaver1;
    private ArrayList<Boolean> enemyDecision = new ArrayList<Boolean>();
    private ArrayList<Boolean> enemyDecision2 = new ArrayList<Boolean>();
    private ArrayList<Boolean> enemyDecision3 = new ArrayList<Boolean>();

    @Before
    public void setUp(){
        cleaver1 = new PlayerStrategyClever2();
    }
    @Test
    public void cleaverEmptyTest(){
        assertEquals(cleaver1.getDecision(enemyDecision),false);
    }
    @Test
    public void cleaverLastDecisionFalse(){
        cleaver1.getDecision(enemyDecision);
        enemyDecision.add(Boolean.FALSE);
        cleaver1.getDecision(enemyDecision);
        enemyDecision.add(Boolean.FALSE);
        assertEquals(cleaver1.getDecision(enemyDecision),false);
    }
    @Test
    public void cleaverBetrayedWithHighLoyalty(){
        cleaver1.getDecision(enemyDecision2);
        enemyDecision2.add(Boolean.FALSE);
        cleaver1.getDecision(enemyDecision2);
        enemyDecision2.add(Boolean.FALSE);
        cleaver1.getDecision(enemyDecision2);
        enemyDecision2.add(Boolean.FALSE);
        cleaver1.getDecision(enemyDecision2);
        enemyDecision2.add(Boolean.TRUE);
        assertEquals(cleaver1.getDecision(enemyDecision2),false);
    }
    @Test
    public void cleaverBetrayedWithLowLoyalty(){
        cleaver1.getDecision(enemyDecision3);
        enemyDecision3.add(Boolean.TRUE);
        cleaver1.getDecision(enemyDecision3);
        enemyDecision3.add(Boolean.TRUE);
        cleaver1.getDecision(enemyDecision3);
        enemyDecision3.add(Boolean.FALSE);
        cleaver1.getDecision(enemyDecision3);
        enemyDecision3.add(Boolean.TRUE);
        assertEquals(cleaver1.getDecision(enemyDecision3),true);
    }
}
