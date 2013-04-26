/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p4790084
 */
public class StrategyException extends Exception{
    public final static String nullStrategy="Strategy doesn't exist";
    public final static String existingStrategy="Strategy name already exist";
     public StrategyException(String exception){
     super(exception);
  }
}
