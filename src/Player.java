
import java.util.ArrayList;


/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 * Class Player represents a player
 *
 * @author Gerard Barrufet Planes, Sergi Orrit Raido
 */
public class Player {

    private StrategyComponent strategy;
    private ArrayList<Boolean> decisions = new ArrayList<Boolean>();
    //private boolean[] decisions=new boolean[Play.rounds];

    /**
     * return a player decision
     *
     * @return
     */
    public boolean playerDecision() {
        return strategy.getDecision(decisions);
    }

    /**
     *
     *
     * @param decision
     */
    public void addDecision(boolean decision) {
        decisions.add(decision);
    }

    public void setStrategy(StrategyComponent strategy) {
        this.strategy = strategy;
    }

    public ArrayList<Boolean> getDecisions() {
        return decisions;
    }

    public StrategyComponent getStrategy() {
        return strategy;
    }
}
