package decorator;

public class Chantilly extends DecorateurIngredient{

    private Boisson boisson;

    public Chantilly(Boisson boisson){
        this.boisson = boisson;
    }

    @Override
    public double cout() {
        return .10 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Chantilly";
    }
}
