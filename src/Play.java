/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
public class Play {
    
    private static Player player1=new Player();
    private Player player2=new Player();
    private static UtilityMatrix uMatrix;
    public static int rounds=7;
    
    public static void main(String[] args) {
        try{
          uMatrix=new UtilityMatrix(3,2,1,0);  
        }catch(MatrixException e){
            System.out.println(e);
        }
        for(int i=0;i<rounds;i++){
            System.out.println(player1.playerDecision());
        }
          System.out.println("UN puto 10");
          System.out.println("UN puto 10");

     }
}
