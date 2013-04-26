/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author p4790084
 */
public class UtilityMatrixTest {

    UtilityMatrix matriu;

    public UtilityMatrixTest() {
    }

    /*
     * @Before public void setUp(){ cleaver1 = new PlayerStrategyClever2(); }
     */
    @Test
    public void addConditionsTest() throws MatrixException {
        matriu = new UtilityMatrix(3, 2, 1, 0);
    }

    @Test
    public void addScoreTrueTrueTest() throws MatrixException {
        matriu = new UtilityMatrix(3, 2, 1, 0);
        int arrayScore[] = {0, 0};
        int spectedScore[] = {2, 2};
        arrayScore = matriu.addScore(arrayScore, true, true);
        assertEquals(arrayScore[0] == spectedScore[0] && arrayScore[1] == spectedScore[1], true);
    }

    @Test
    public void addScoreTrueFalseTest() throws MatrixException {
        matriu = new UtilityMatrix(3, 2, 1, 0);
        int arrayScore[] = {0, 0};
        int spectedScore[] = {0, 3};
        arrayScore = matriu.addScore(arrayScore, true, false);
        assertEquals(arrayScore[0] == spectedScore[0] && arrayScore[1] == spectedScore[1], true);
    }

    @Test
    public void addScoreFalseTrueTest() throws MatrixException {
        matriu = new UtilityMatrix(3, 2, 1, 0);
        int arrayScore[] = {0, 0};
        int spectedScore[] = {3, 0};
        arrayScore = matriu.addScore(arrayScore, false, true);
        assertEquals(arrayScore[0] == spectedScore[0] && arrayScore[1] == spectedScore[1], true);
    }

    @Test
    public void addScoreFalseFalseTest() throws MatrixException {
        matriu = new UtilityMatrix(3, 2, 1, 0);
        int arrayScore[] = {0, 0};
        int spectedScore[] = {1, 1};
        arrayScore = matriu.addScore(arrayScore, false, false);
        assertEquals(arrayScore[0] == spectedScore[0] && arrayScore[1] == spectedScore[1], true);
    }

    @Test(expected = MatrixException.class)
    public void wrongConditionsTest() throws MatrixException {
        matriu = new UtilityMatrix(1, 2, 3, 4);
    }
}
