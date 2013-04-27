
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 * Class of a blind strategy
 *
 * @author Gerard Barrufet Planes, Sergi Orrit Raido
 */
public class PlayerStrategyPerChulaJo extends StrategyComponent implements PlayerStrategy {

    /**
     * a function called by a player to get a decision
     *
     * @param enemyDecision needs the enemy decisions to choose a decision
     * @return a boolean
     */
    public boolean getDecision(ArrayList<Boolean> enemyDecision) {
        return false;
    }
}
