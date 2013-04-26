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
public class RegisterTest {

    private StrategyComponent component1;
    private StrategyComponent component2;
    private StrategyComponent component3;
    private StrategyComponent component4;
    private StrategyComponent component5;

    @Before
    public void setUp() {
        component1 = new PlayerStrategyCandida();
        component2 = new PlayerStrategyPerChulaJo();
        component3 = new PlayerStrategyClever1();
        component4 = new PlayerStrategyClever2();
        component5 = new PlayerStrategyRandom();

    }

    @Test
    public void RegisterAddTest() {
        try {
            Register.register.addStrategy("Candida", component1);
            assertEquals(Register.register.getStrategy("Candida"), component1);
        } catch (StrategyException e) {
        }

    }

    @Test
    public void RegisterGetStrategyTest() throws StrategyException {
        Register.register.addStrategy(Register.clever1, component3);
        Register.register.addStrategy(Register.perChulaJo, component2);
        StrategyComponent component6 = Register.register.getStrategy(Register.candida);
        assertEquals(component6, Register.register.getStrategy(Register.candida));
    }

    @Test(expected = StrategyException.class)
    public void RegisterGetStrategyExceptionTest() throws StrategyException {
        Register.register.getStrategy("ABC");
    }
        @Test(expected = StrategyException.class)
    public void RegisterAddExceptionTest() throws StrategyException {
        Register.register.addStrategy(Register.candida, component1);
    }
}
