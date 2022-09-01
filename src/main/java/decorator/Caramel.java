package decorator;

public class Caramel extends DecorateurIngredient{
    private Boisson boisson;
    private Taille taille;
    public Caramel(Boisson boisson){
        this.boisson = boisson;
    }

    @Override
    public double cout() {
        return .15 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Caramel";
    }

    @Override
    public Taille getTaille() {
        return null;
    }

    @Override
    public void setTaille(Taille taille) {

    }
}
