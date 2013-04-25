/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
public class Play {

    private static Player player1 = new Player();
    private static Player player2 = new Player();
    private static boolean player1decision;
    private static boolean player2decision;
    private static UtilityMatrix uMatrix;
    public static int rounds = 15;

    public static void main(String[] args) {
        try {
            uMatrix = new UtilityMatrix(3, 2, 1, 0);
        } catch (MatrixException e) {
            System.out.println(e);
        }
        player1.setStrategy(Register.getPlayerStrategy(Register.candida));
        player2.setStrategy(Register.getPlayerStrategy(Register.clever1));
        for (int i = 0; i < rounds; i++) {
            player1decision=player1.playerDecision();
            player2decision=player2.playerDecision();
            player1.addDecision(player2decision);
            player2.addDecision(player1decision);
            
            System.out.println("Player1: " + player1decision);              
            System.out.println("Player2: " + player2decision);
        }
        System.out.println("UN puto 10");
        System.out.println("UN puto 10");

    }
}
