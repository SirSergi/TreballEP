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
public class PlayerStrategyRandomTest {
    int vtrue = 0;
    int vfalse = 0;
private StrategyComponent random= new PlayerStrategyRandom();

    @Test
    public void randomTest(){
        while(vfalse == 0 || vtrue == 0){
            if(random.getDecision(null)) vtrue++;
            else vfalse++;
        }
        assertEquals(vtrue>0,vfalse>0);
    }
}
