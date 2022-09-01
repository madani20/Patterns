package decorator;

public class Lait extends DecorateurIngredient{
    private Boisson boisson;
    public Lait(Boisson boisson){
        this.boisson = boisson;
    }

    @Override
    public double cout() {
        return .10 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Lait";
    }
}
