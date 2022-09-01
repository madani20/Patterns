package decorator;

public abstract class Boisson {
    protected String description = "Boisson inconnue";
    protected Taille taille;
    public String getDescription(){
        return description;
    }
    public abstract Taille getTaille();
    public abstract void setTaille(Taille taille);
    public abstract double cout();
}
