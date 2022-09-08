package singleton;

public class TestSingleton {
    public static void main(String[] args) throws InterruptedException {

        for(int i=1;i<=5;i++) {
            Task t=new Task("Tache " + i);
            t.start();
        }
    }
}
