package singleton;

public class Singleton {
    private static volatile Singleton instance;

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
    public void traiter() throws InterruptedException {
        System.out.println("Un traitement quelconque : ");
        for(int i=0;i<5;i++){
            System.out.println("traitement " + i);
            Thread.sleep(1000);
        }
    }
}
