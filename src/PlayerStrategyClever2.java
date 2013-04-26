
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
public class PlayerStrategyClever2 implements PlayerStrategy{
    
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
            return false;
        }
        if (lastDecision == false) {
            return false;
        }
        if (lastDecision == true && loyalty > (betrayed + loyalty) / 2) {
            return false;
        } else {
            return true;
        }
    }
}
