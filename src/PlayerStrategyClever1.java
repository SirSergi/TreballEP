
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 * Class of a clever strategy
 *
 * @author p4790084
 */
public class PlayerStrategyClever1 extends StrategyComponent implements PlayerStrategy {

    int pardon = 0;

    /**
     * a function called by a player to get a decision
     *
     * @param enemyDecision needs the enemy decisions to choose a decision
     * @return a boolean
     */
    public boolean getDecision(ArrayList<Boolean> enemyDecision) {
        int loyalty = 0;
        int betrayed = 0;

        boolean lastDecision = false;
        for (boolean e : enemyDecision) {
            if (e == true) {
                betrayed++;
            } else {
                loyalty++;
            }
            lastDecision = e;
        }
        if (enemyDecision.isEmpty()) {
            System.out.println(" / Primera eleccio / ");
            return false;

        }
        if (lastDecision == false && betrayed == 0) {
            return true;
        }
        if (lastDecision == true && pardon == 0) {
            pardon += 2;
            return false;
        } else if (pardon > 0) {
            pardon--;
            return true;
        } else {
            return false;
        }
    }
}
