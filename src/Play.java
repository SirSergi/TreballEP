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
    public static int playerScore[] = {0, 0};
    private static boolean player1decision;
    private static boolean player2decision;
    private static UtilityMatrix uMatrix;
    public static int rounds = 150;

    public static void main(String[] args) {
        try {
            uMatrix = new UtilityMatrix(3, 2, 1, 0);
        } catch (MatrixException e) {
            System.out.println(e);
        }
        player1.setStrategy(Register.getPlayerStrategy(Register.perChulaJo));
        player2.setStrategy(Register.getPlayerStrategy(Register.perChulaJo));
        for (int i = 0; i < rounds; i++) {
            player1decision = player1.playerDecision();
            player2decision = player2.playerDecision();
            player1.addDecision(player2decision);
            player2.addDecision(player1decision);
            uMatrix.addScore(player1decision, player2decision);
            System.out.println("Player1: " + player1decision);
            System.out.println("Player2: " + player2decision);
        }
        System.out.println("Player 1 score: " + playerScore[0]);
        System.out.println("Player 2 score: " + playerScore[1]);

    }
}
