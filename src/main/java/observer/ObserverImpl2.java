package observer;

public class ObserverImpl2 implements Observer {

    private double lastEtat;

    @Override
    public void update(Observable observable) {
        int etat = ((ObservableImpl)observable).getEtat();
        lastEtat=  etat- lastEtat;
    if ( lastEtat< 0)
        System.out.println("Observateur 2  = > Dépression: " + lastEtat);
    else if (lastEtat > 0)
        System.out.println("Observateur 2  = > Augmentation de la pression: " + lastEtat);
    else
        System.out.println("Observateur 2  = > Pression constante : " + lastEtat);
        lastEtat=etat;
    }
    }

