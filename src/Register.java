
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
public class Register {
    public static final int perChulaJo=0;
    public static final int candida=1;
    public static final int random=2;
    public static final int clever1=3;
    public static final int clever2=4;
    public static final Register register=new Register();
    private ArrayList<PlayerStrategy> strategies=new ArrayList<PlayerStrategy>();
    
    private Register(){}
    
    public void initializate(){
        strategies.add(new PlayerStrategyPerChulaJo());
        strategies.add(new PlayerStrategyCandida());
        strategies.add(new PlayerStrategyRandom());
        strategies.add(new PlayerStrategyClever1());
        strategies.add(new PlayerStrategyClever2());
    }
    public PlayerStrategy getStrategy(int strategy){
        return strategies.get(strategy);
    }
}
