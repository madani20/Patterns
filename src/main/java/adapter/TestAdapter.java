package adapter;

public class TestAdapter {

    public static void main(String[] args) {
        Peritele peritele = new Adapter(new PlugingRCA());
        peritele.plugPeritele();
    }

}
