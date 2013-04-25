/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
public class Register {
    public static final int perChulaJo=1;
    public static final int candida=2;
    public static final int random=3;
    public static final int clever1=4;
    public static final int clever2=5;
    
    public static PlayerStrategy getPlayerStrategy(int strategy){
         switch(strategy){
             case 1: return new PlayerStrategy(perChulaJo);
             case 2: return new PlayerStrategy(candida);
             case 3: return new PlayerStrategy(random);
             case 4: return new PlayerStrategy(clever1);
             case 5: return new PlayerStrategy(clever2);
             default: return new PlayerStrategy(perChulaJo);
         }
    }
}
