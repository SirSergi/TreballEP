
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 * Class of a composite strategy of single and composite strategies
 *
 * @author p4790084
 */
public class PlayerStrategyComposite extends StrategyComponent implements PlayerStrategy {

    /**
     * ArrayList of strategies
     */
    private ArrayList<StrategyComponent> strategyList = new ArrayList<StrategyComponent>();

    /**
     * a function called by a player to get a decision
     *
     * @param enemyDecision needs the enemy decisions to choose a decision
     * @return a boolean
     */
    @Override
    public boolean getDecision(ArrayList<Boolean> enemyDecision) {
        int trueCount = 0;
        int falseCount = 0;

        for (StrategyComponent strategy : strategyList) {
            if (strategy.getDecision(enemyDecision)) {
                trueCount++;
            } else {
                falseCount++;
            }
        }

        if (trueCount >= falseCount) {
            return true;
        } else {
            return false;
        }


    }

    /**
     * adds a strategy
     *
     * @param strategyName name of the strategy
     * @throws StrategyException throws if name already exist
     */
    public void addStrategy(String strategyName) throws StrategyException {
        this.strategyList.add(Register.register.getStrategy(strategyName));
    }

    /**
     * remove a strategy
     *
     * @param strategyName name of the strategy
     * @throws StrategyException throws if name dosn't exist
     */
    public void removeStrategy(String strategyName) throws StrategyException {
        this.strategyList.remove(Register.register.getStrategy(strategyName));
    }
}
