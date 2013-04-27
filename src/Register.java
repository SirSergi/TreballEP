
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 * Class that save the strategies
 *
 * @author Gerard Barrufet Planes, Sergi Orrit Raido
 */
public class Register {

    /**
     * string that represents perChulaJo strategy
     */
    public static final String perChulaJo = "Per chula jo";
    /**
     * string that represents candida strategy
     */
    public static final String candida = "Candida";
    /**
     * string that represents random strategy
     */
    public static final String random = "Random";
    /**
     * string that represents clever1 strategy
     */
    public static final String clever1 = "Clever 1";
    /**
     * string that represents clever2 strategy
     */
    public static final String clever2 = "Clever 2";
    /**
     * initialize a new Register
     */
    public static final Register register = new Register();
    /**
     * hashmap of strategies
     */
    static private HashMap<String, StrategyComponent> strategies = new HashMap();

    /**
     * constructor
     */
    private Register() {
    }

    /**
     * initialize the register with some strategies
     */
    public void initializate() {
        strategies.put("Per chula jo", new PlayerStrategyPerChulaJo());
        strategies.put("Candida", new PlayerStrategyCandida());
        strategies.put("Random", new PlayerStrategyRandom());
        strategies.put("Clever 1", new PlayerStrategyClever1());
        strategies.put("Clever 2", new PlayerStrategyClever2());
    }

    /**
     * get a strategy with an input string name of a strategy
     *
     * @param nom name of a strategy
     * @return a StrategyComponent
     * @throws StrategyException thows if name dosn't exist
     */
    public StrategyComponent getStrategy(String nom) throws StrategyException {
        StrategyComponent strategy = strategies.get(nom);
        if (strategy == null) {
            throw new StrategyException(StrategyException.nullStrategy);
        }
        return strategy;
    }

    /**
     * add a strategy if an input string name of this new strategy
     *
     * @param nom name of a strategy
     * @param strategy a StrategyComponent
     * @throws StrategyException throws if name already exist
     */
    public void addStrategy(String nom, StrategyComponent strategy) throws StrategyException {
        if (strategies.containsKey(nom)) {
            throw new StrategyException(StrategyException.existingStrategy);
        }
        strategies.put(nom, strategy);
    }
}
