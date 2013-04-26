
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
public abstract class StrategyComponent {
    public abstract boolean getDecision(ArrayList<Boolean> enemyDecision);
    public void addStrategy(String nom){};
    
}
