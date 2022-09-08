package singleton;

public class Task extends Thread{
    private String namedTask;

    public Task(String namedTask){
        this.namedTask=namedTask;
    }

    @Override
    public void run() {
        Singleton instance=Singleton.getInstance();

        try {
            instance.traiter(namedTask);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
