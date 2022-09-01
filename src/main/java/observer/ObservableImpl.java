package observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private List<Observer> observers=new ArrayList<>();
    private int etat;
    @Override
    public void subsrcribe(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifiObserver() {
        for (Observer obs : observers) {
            obs.update(this);
        }
    }

    public int getEtat() {

        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
        this.notifiObserver();
    }
}
