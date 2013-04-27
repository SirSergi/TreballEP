/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class Play represents a game
 *
 * @author p4790084
 */
public class Play extends Observable {

    /**
     * represents a player
     */
    private static Player player1 = new Player();
    /**
     * represents a player
     */
    private static Player player2 = new Player();
    /**
     * array of score of both players
     */
    public static int playerScore[] = {0, 0};
    /**
     * boolean of decision of player 1
     */
    private static boolean player1decision;
    /**
     * boolean of decision of player 2
     */
    private static boolean player2decision;
    /**
     * utilitymatrix represents the score when player choose a decision
     */
    private static UtilityMatrix uMatrix;
    /**
     * numer of rounds of a game
     */
    public static int rounds = 150;

    /**
     * Constructor waiting 2 players, 1 UtilityMatrix and how many rounds u want
     * to test for a single game.
     *
     * @param player1 represents player 1
     * @param player2 represents player 2
     * @param uMatrix an utilityMatrix that represent the scores for player
     * decisions
     * @param rounds number of rounds of the game
     */
    public Play(Player player1, Player player2, UtilityMatrix uMatrix, int rounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.uMatrix = uMatrix;
        this.rounds = rounds;
    }

    /**
     * Set a strategy to a given player
     *
     * @param player represents a player
     * @param strategy represents the new strategy
     */
    public void setPlayerStrategy(Player player, StrategyComponent strategy) {
        player.setStrategy(strategy);
    }

    /**
     * function that simulates a match
     *
     * @return a both players score
     */
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
