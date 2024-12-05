package org.example.Ex3Observer;

public class Oberver_NotifConsole implements Observer {

    private String name;

    public Oberver_NotifConsole(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(" Notification : nouvelle utilisateur "+message);
    }
}
