
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 * Class of a Blind strategy
 *
 * @author Gerard Barrufet Planes, Sergi Orrit Raido
 */
public class PlayerStrategyCandida extends StrategyComponent implements PlayerStrategy {

    /**
     * a function called by a player to get a decision
     *
     * @param enemyDecision needs the enemy decisions to choose a decision
     * @return a boolean (ever true because is a blind strategy)
     */
    public boolean getDecision(ArrayList<Boolean> enemyDecision) {
        return true;
    }
}
