package singleton;

public class TestSingleton {
    public static void main(String[] args) throws InterruptedException {
        Singleton instance=Singleton.getInstance();
        instance.traiter();
    }
}
