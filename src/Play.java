/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
public class Play implements Observer {

    private static Player player1 = new Player();
    private static Player player2 = new Player();
    public static int playerScore[] = {0, 0};
    private static boolean player1decision;
    private static boolean player2decision;
    private static UtilityMatrix uMatrix;
    public static int rounds = 150;

    public Play(Player player1, Player player2, UtilityMatrix uMatrix, int rounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.uMatrix = uMatrix;
        this.rounds = rounds;
    }

    public void setPlayerStrategy(int player, StrategyComponent strategy) {
        if (player == 1) {
            player1.setStrategy(strategy);
        } else {
            player2.setStrategy(strategy);
        }
    }

    public int[] simulateMatch() {
        for (int i = 0; i < rounds; i++) {
            player1decision = player1.playerDecision();
            player2decision = player2.playerDecision();
            player1.addDecision(player2decision);
            player2.addDecision(player1decision);
            playerScore = uMatrix.addScore(playerScore, player1decision, player2decision);
            System.out.println("Player1: " + player1decision);
            System.out.println("Player2: " + player2decision);
        }
        System.out.println("Player 1 score: " + playerScore[0]);
        System.out.println("Player 2 score: " + playerScore[1]);
        return playerScore;
    }

    public void change(Play game) {
    }
    /*
     * public static void main(String[] args) { try { uMatrix = new
     * UtilityMatrix(3, 2, 1, 0); } catch (MatrixException e) {
     * System.out.println(e); } Register.register.initializate();
     *
     * player1.setStrategy(Register.register.getStrategy(Register.candida));
     * //player2.setStrategy(Register.register.getStrategy(Register.candida));
     * StrategyComponent a=new PlayerStrategyComposite();
     * a.addStrategy(Register.candida); a.addStrategy(Register.perChulaJo);
     * a.addStrategy(Register.candida);
     * Register.register.addStrategy("Candida+Chula", a);
     *
     * player2.setStrategy(Register.register.getStrategy("Candida+Chula")); //
     * player2.setStrategy(Register.register.getStrategy(Register.clever2));
     *
     * }
     */
}
