package decorator;

public class Deca extends Boisson{
    public Deca(){
        description = "Déca";
    }
    @Override
    public double cout(){
        return 1.05;
    }
}
