package decorator;

import java.util.Arrays;

public class TestDecorator {
    public static void main(String[] args) {
        Boisson boisson = new Expresso();
        System.out.println(boisson.getDescription() + " " + boisson.cout() + " €");

        Boisson boisson1=new Sumatra();
        boisson1 = new Chocolat(boisson1);
        boisson1 = new Chocolat(boisson1);
        boisson1 = new Chantilly(boisson1);
        System.out.println(boisson1.getDescription() + " " + boisson1.cout() + " €");

        Boisson boisson2 = new Colombia();
        boisson2 = new Caramel(boisson2);
        boisson2 = new Chocolat(boisson2);
        boisson2 = new Chantilly(boisson2);
        System.out.println(boisson2.getDescription() + " " +boisson2.cout());

        Boisson boisson3 = new Lait(new Chantilly(new Caramel(new Chocolat(new Sumatra()))));
        System.out.println(boisson3.getDescription() + " " + boisson3.cout());


    }
}
