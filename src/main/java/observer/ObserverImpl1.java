package observer;

public class ObserverImpl1 implements Observer {
    private double cumul;
    @Override
    public void update(Observable observable) {
        double etat = ((ObservableImpl)observable).getEtat();
        cumul += etat;
        System.out.println("Observateur 1  = > Etat cumulé : " + cumul);
        etat = cumul;
    }
}
