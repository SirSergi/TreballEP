
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
public class PlayerStrategyComposite extends StrategyComponent implements PlayerStrategy{
    private ArrayList<StrategyComponent> strategyList=new ArrayList<StrategyComponent>();
    
    @Override
   public boolean getDecision(ArrayList<Boolean> enemyDecision) {
         int trueCount = 0;
         int falseCount = 0;
         
          for(StrategyComponent strategy: strategyList){
              if(strategy.getDecision(enemyDecision)) trueCount++;
              else falseCount++;
          }
          
          if(trueCount >= falseCount) return true;
          else return false;
          
          
    }
   
   public void addStrategy(String strategyName){
       this.strategyList.add(Register.register.getStrategy(strategyName));
   }
   
   public void removeStrategy(String strategyName){
       this.strategyList.remove(Register.register.getStrategy(strategyName));
   }
}
