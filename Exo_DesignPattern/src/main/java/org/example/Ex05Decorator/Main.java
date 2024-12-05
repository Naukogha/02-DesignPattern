package org.example.Ex05Decorator;

public class Main {
    public static void main(String[] args) {
        Text baseTexte = new PlainText();
        System.out.println(baseTexte);

        Text casseTexte = new PlainText(baseTexte);
    }
}
