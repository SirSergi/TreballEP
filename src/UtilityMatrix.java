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


    public void addScore(boolean p1, boolean p2){
        if(p1==true && p2==true){
            Play.playerScore[0]+=prize;
            Play.playerScore[1]+=prize;
        } else if(p1==true && p2==false){
            Play.playerScore[0]+=nerd;
            Play.playerScore[1]+=temptation;
        } else if(p1==false && p2==true){
            Play.playerScore[0]+=temptation;
            Play.playerScore[1]+=nerd;
        } else {
            Play.playerScore[0]+=punish;
            Play.playerScore[1]+=punish;
        }
    }

    
}
