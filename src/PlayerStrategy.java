/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
import acm.util.RandomGenerator;
import java.util.ArrayList;

public class PlayerStrategy {

    private int chosenStrategy;
int pardon = 0;
    public PlayerStrategy(int chosenStrategy) {
        this.chosenStrategy = chosenStrategy;
    }

    public boolean playerDecision(ArrayList<Boolean> decisions) {
        switch (this.chosenStrategy) {
            case 1:
                return perChulaJo();
            case 2:
                return Candida();
            case 3:
                return random();
            case 4:
                return clever1(decisions);
            case 5:
                return clever2(decisions);
            default:
                return true;
        }
    }

    public boolean perChulaJo() {
        return false;
    }

    public boolean Candida() {
        return true;
    }

    public boolean random() {
        RandomGenerator rgen = RandomGenerator.getInstance();
        return rgen.nextBoolean();
    }

    public boolean clever1(ArrayList<Boolean> enemyDecision) {
        int loyalty = 0;
        int betrayed = 0;
        
        boolean lastDecision = false;
        for (boolean e : enemyDecision) {
            if (e == true) {
                betrayed++;
            } else {
                loyalty++;
            }
            lastDecision = e;
        }
        if (enemyDecision.isEmpty()) {
            System.out.println(" / Primera eleccio / ");
            return false;
            
        }
        if (lastDecision == false && betrayed == 0) {
            return true;
        }
        if (lastDecision == true && pardon == 0) {
            pardon += 2;
            return false;
        } else if (lastDecision == true && pardon > 0) {
            pardon--;
            return true;
        } else {
            return false;
        }
    }

    public boolean clever2(ArrayList<Boolean> enemyDecision) {
        int loyalty = 0;
        int betrayed = 0;
        boolean lastDecision = false;
        for (boolean e : enemyDecision) {
            if (e == true) {
                betrayed++;
            } else {
                loyalty++;
            }
            lastDecision = e;
        }
        if (enemyDecision.isEmpty()) {
            return false;
        }
        if (lastDecision == false) {
            return false;
        }
        if (lastDecision == true && loyalty > (betrayed + loyalty) / 2) {
            return false;
        } else {
            return true;
        }
    }
}
