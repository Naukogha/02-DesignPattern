package org.example.demos.creational;

public class Main {

    public static void main(String[] args) {
        SingletonExample singletonExample1 = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();

        System.out.println("Comparaison des deux instances de singleton : "+(singletonExample1 == singletonExample2));


    }
}
