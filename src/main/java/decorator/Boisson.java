package decorator;

public abstract class Boisson {
    protected String description = "Boisson inconnue";

    public String getDescription(){
        return description;
    }


    public abstract double cout();
}
