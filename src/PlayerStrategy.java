/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */

import acm.util.RandomGenerator;
import java.util.ArrayList;


public class PlayerStrategy {
    
    public boolean perChulaJo() {
        return false;
    }
    public boolean Candida(){
        return true;
    }
    public boolean random(){
         RandomGenerator rgen = RandomGenerator.getInstance();
        return rgen.nextBoolean();
    }
    public boolean clever(ArrayList<Boolean> enemyDecision){
        int loyalty=0;
        int betrayed=0;
        for(boolean e: enemyDecision){
            if(e==true){
                betrayed++;
            }else{
                loyalty++;
            }
        }
        if (betrayed==0 || loyalty==0){
            return true;
        }
        return true;
    }
    
}
