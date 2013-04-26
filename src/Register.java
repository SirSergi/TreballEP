
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author p4790084
 */
public class Register {

    public static final String perChulaJo = "Per chula jo";
    public static final String candida = "Candida";
    public static final String random = "Random";
    public static final String clever1 = "Clever 1";
    public static final String clever2 = "Clever 2";
    public static final Register register = new Register();
   // private ArrayList<StrategyComponent> strategies = new ArrayList<StrategyComponent>();
    static private  HashMap  <String,StrategyComponent> strategies = new HashMap(); 

    private Register() {
    }
    /**
     * 
     */
    public void initializate() {
        strategies.put("Per chula jo",new PlayerStrategyPerChulaJo());
        strategies.put("Candida",new PlayerStrategyCandida());
        strategies.put("Random",new PlayerStrategyRandom());
        strategies.put("Clever 1",new PlayerStrategyClever1());
        strategies.put("Clever 2",new PlayerStrategyClever2());  
    }

    public StrategyComponent getStrategy(String nom) {
        return strategies.get(nom);
    }
    public void addStrategy(String nom,StrategyComponent strategy){
        strategies.put(nom,strategy);
    }
}
