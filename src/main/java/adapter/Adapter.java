package adapter;

public class Adapter implements Peritele{
    public Plug adaptee;

    public Adapter(Plug adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void plugPeritele() {
        adaptee.plugRCA();
    }
}
