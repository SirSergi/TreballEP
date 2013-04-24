/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
public class UtilityMatrix {

    private int temptation;
    public  int prize;
    private int punish;
    private int nerd;

    public UtilityMatrix(int temptation, int prize, int punish, int nerd) throws MatrixException {
        if (temptation <= prize || prize <= punish || punish <= nerd || prize <= ((temptation + nerd) / 2)) {
            throw new MatrixException();
        } else {
            this.temptation = temptation;
            this.prize = prize;
            this.punish = punish;
            this.nerd = nerd;
        }

    }

}
