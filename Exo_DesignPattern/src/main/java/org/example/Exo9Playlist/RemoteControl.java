package org.example.Exo9Playlist;

public class RemoteControl {
    private Command command;


    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(String title){
        if(command != null){
            command.execute(title);
        }else {
            System.out.println("Aucune commande assigné a ce bouton");
        }
    }
}
