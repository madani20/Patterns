package singleton;

public class Singleton {
    private static volatile Singleton instance;
    private int cpt=0;
    private Singleton(){System.out.println("Instanciation du singleton");};

    public static Singleton getInstance() {
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
            }
            }
        }
        return instance;
    }
    public void traiter(String str) throws InterruptedException {
        for(int i=0;i<5;i++){
            System.out.println("traitement de la tache "+ str );
            ++cpt;
            Thread.sleep(1000);
        }
        System.out.println("compteur :........ " + cpt);
    }
}
