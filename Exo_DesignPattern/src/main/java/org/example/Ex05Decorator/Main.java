package org.example.Ex05Decorator;

public class Main {
    public static void main(String[] args) {
        Text baseTexte = new PlainText();
        System.out.println(baseTexte.transform());

        Text casseTexte = new CasseDecorator(baseTexte);
        System.out.println(casseTexte.transform());

        Text prefixe = new PrefixeDecorator(baseTexte);
        System.out.println(prefixe.transform());

        Text prefixe2 = new PrefixeDecorator(casseTexte);
        System.out.println(prefixe2.transform());
    }
}
