package decorator;

public class Expresso extends Boisson{
    public Expresso(){
        description = "Expresso";
    }

    @Override
    public Taille getTaille() {
        return null;
    }

    @Override
    public void setTaille(Taille taille) {

    }

    @Override
    public double cout() {


        return 1.99;
    }
}
