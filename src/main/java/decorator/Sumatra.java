package decorator;

public class Sumatra extends Boisson{
    public Sumatra(){
        description = "Sumatra";
    }

    @Override
    public double cout() {
        return .99;
    }
}
