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
public class PlayerStrategyCompositeTest {

    private StrategyComponent compositeStrategy = new PlayerStrategyComposite();

    @Before
    public void setUp() {
        Register.register.initializate();
        compositeStrategy.addStrategy(Register.candida);
        compositeStrategy.addStrategy(Register.candida);
        compositeStrategy.addStrategy(Register.perChulaJo);

    }

    @Test
    public void CompositeTest() {
        assertEquals(compositeStrategy.getDecision(null), true);
    }

    @Test
    public void CompositeAddTest() {
        StrategyComponent composite1 = new PlayerStrategyComposite();
        composite1.addStrategy(Register.perChulaJo);
        assertEquals(composite1.getDecision(null), false);
    }

    @Test
    public void CompositeRemoveTest() {

        compositeStrategy.removeStrategy(Register.candida);
        compositeStrategy.removeStrategy(Register.candida);
        assertEquals(compositeStrategy.getDecision(null), false);
    }

    @Test
    public void CompositeWithMultipleCompositesTest() {
        StrategyComponent composite1 = new PlayerStrategyComposite();
        composite1.addStrategy(Register.perChulaJo);
        composite1.addStrategy(Register.perChulaJo);
        StrategyComponent composite2 = new PlayerStrategyComposite();
        composite2.addStrategy(Register.perChulaJo);
        composite2.addStrategy(Register.perChulaJo);
        composite2.addStrategy(Register.candida);
        composite2.addStrategy(Register.perChulaJo);
        Register.register.addStrategy("Compost1", composite1);
        Register.register.addStrategy("Compost2", composite2);
        compositeStrategy.addStrategy("Compost1");
        compositeStrategy.addStrategy("Compost2");
        assertEquals(compositeStrategy.getDecision(null), false);
    }
}
