/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerard Barrufet Planes, Sergi Orrit Raido
 */
import java.util.ArrayList;

public abstract class Observable {

    public ArrayList<Observer> observers;
    //El constructor crea el vector con la asociacion Observable-Observador

    public Observable() {
        observers = new ArrayList<Observer>();
    }

    //Agregar y eliminar sencillamente operan sobre vector _observadores...
    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    //Notificacion: Para cada observador se invoca el método actualizar().
    public void notifyObservers(Boolean p1, Boolean p2, int[] score) {
        for (Observer o : observers) {
            o.change(p1, p2, score);
        }
    }
}
