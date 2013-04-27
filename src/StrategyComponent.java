
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 * abstrac class of strategy component for the composite pattern
 *
 * @author Gerard Barrufet Planes, Sergi Orrit Raido
 */
public abstract class StrategyComponent {

    /**
     * a function called by a player to get a decision
     *
     * @param enemyDecision array of booleans
     * @return boolean (the decision of a player)
     */
    public abstract boolean getDecision(ArrayList<Boolean> enemyDecision);

    /**
     * adds a strategy
     *
     * @param name name of strategy
     * @throws StrategyException throws if name already exist
     */
    public void addStrategy(String name) throws StrategyException {
    }

    ;
    /**
     * remove a strategy 
     * 
     * @param name name of strategy
     * @throws StrategyException  throws if name dosn't exist
     */
    public void removeStrategy(String name) throws StrategyException {
    }
;
}
