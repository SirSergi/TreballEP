
import acm.util.RandomGenerator;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
public class PlayerStrategyRandom extends StrategyComponent implements PlayerStrategy{
    
         public boolean getDecision(ArrayList<Boolean> enemyDecision) {
        RandomGenerator rgen = RandomGenerator.getInstance();
        return rgen.nextBoolean();
    }

}
