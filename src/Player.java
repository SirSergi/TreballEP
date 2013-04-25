
import java.util.ArrayList;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
public class Player {
    private PlayerStrategy strategy;
    private ArrayList<Boolean> decisions=new ArrayList<Boolean>();
    //private boolean[] decisions=new boolean[Play.rounds];
    
    
    public boolean playerDecision(){
        return strategy.playerDecision(decisions);
    }
    public void addDecision(boolean decision){
        decisions.add(decision);
    }
    public void setStrategy(PlayerStrategy strategy){
        this.strategy=strategy;
    }
  
}
