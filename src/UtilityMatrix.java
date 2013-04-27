/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerard Barrufet Planes, Sergi Orrit Raido
 */
public class UtilityMatrix {
/**
 * variable temptation, represents a score for when players choose
 */
    private int temptation;
    /**
     * variable prize, represents a score for when players choose
     */
    public  int prize;
    /**
     * variable punish, represents a score for when players choose
     */
    private int punish;
    /**
     * variable nerd, represents a score for when players choose
     */
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


 public int[] addScore(int score[],boolean p1, boolean p2){
        if(p1==true && p2==true){
            score[0]+=prize;
            score[1]+=prize;
        } else if(p1==true && p2==false){
            score[0]+=nerd;
            score[1]+=temptation;
        } else if(p1==false && p2==true){
            score[0]+=temptation;
            score[1]+=nerd;
        } else {
            score[0]+=punish;
            score[1]+=punish;
        }
        return score;
    }

    
}
