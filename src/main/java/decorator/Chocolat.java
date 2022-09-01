package decorator;

public class Chocolat extends DecorateurIngredient{
    private Boisson boisson;
    public  Chocolat(Boisson boisson){
        this.boisson = boisson;
    }
    @Override
    public double cout() {
        return .20 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Chocolat";
    }
}
