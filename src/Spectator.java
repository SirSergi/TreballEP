/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerard Barrufet Planes, Sergi Orrit Raido
 */
public class Spectator implements Observer {

    /**
     * simulate a concrete observer who recieves data from a game
     *
     * @param p1 represents player 1 decision
     * @param p2 represents player 2 decision
     * @param score represents score of both players
     */
    public void change(Boolean p1, Boolean p2, int[] score) {
        System.out.println("------------------------------------");
        if (p1) {
            System.out.println("| Player 1 chose betray the Player 2 |");
        } else {
            System.out.println("| Player 1 chose pardon the Player 2 |");
        }
        System.out.println("------------------------------------");
        if (p2) {
            System.out.println("| Player 2 chose betray the Player 1 |");
        } else {
            System.out.println("| Player 2 chose pardon the Player 1 |");
        }
        System.out.println("------------------------------------");
        System.out.println("\n>>> The player's 1 score is " + score[0] + " and the player's 2 score is " + score[1] + " <<<\n");


    }
;
}
