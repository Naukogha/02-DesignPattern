package org.example.Ex3Observer;

public class Observer_WriteFile implements Observer {

    private String name;

    public Observer_WriteFile(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(" Ecriture : user "+message);
    }
}
