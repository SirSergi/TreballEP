/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author p4790084
 */
public class PlayerStrategiCandidaTest {
    
    private StrategyComponent candida= new PlayerStrategyCandida();
    @Test
    public void candidaTest(){
        assertEquals(candida.getDecision(null),true);
    }
   
  
}
