package org.example.demos.structural;

public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();

        //Utilisation de mon adaptateur
        Target target = new Adapter(adaptee);


        target.request();
    }
}
