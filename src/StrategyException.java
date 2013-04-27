/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerard Barrufet Planes, Sergi Orrit Raido
 */
public class StrategyException extends Exception {

    /**
     * output for non existing strategy
     */
    public final static String nullStrategy = "Strategy doesn't exist";
    /**
     * output for existing strategy
     */
    public final static String existingStrategy = "Strategy name already exist";

    /**
     * throws the exception
     *
     * @param exception
     */
    public StrategyException(String exception) {
        super(exception);
    }
}
