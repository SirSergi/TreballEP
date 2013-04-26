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
public class PlayerStrategyPerChulaJoTest {
    
    private StrategyComponent perChulaJo= new PlayerStrategyPerChulaJo();
    @Test
    public void candidaTest(){
        assertEquals(perChulaJo.getDecision(null),false);
    }
   
}
