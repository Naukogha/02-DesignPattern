package org.example.Ex3Observer;

public class Main {
    public static void main(String[] args) {
        EventManager subject = new EventManager();

        Observer notif = new Oberver_NotifConsole("observer 1");
        Observer write = new Observer_WriteFile("observer 2");

        subject.addObserver(notif);
        subject.addObserver(write);

        subject.notifyObserver("marielef");
        subject.notifyObserver("marilef");

    }
}
