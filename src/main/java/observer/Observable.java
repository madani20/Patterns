package observer;

public interface Observable {
    void subsrcribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifiObserver();
}
