/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
import java.util.ArrayList;

/**
 * PlayerStrategy Interface
 *
 * @author Gerard Barrufet Planes, Sergi Orrit Raido
 */
public interface PlayerStrategy {

    /**
     *
     *
     * @param enemyDecision needs the enemy decisions to choose a decision
     * @return return a decision
     */
    public boolean getDecision(ArrayList<Boolean> enemyDecision);
}
