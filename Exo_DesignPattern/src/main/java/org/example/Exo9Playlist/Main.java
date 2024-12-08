package org.example.Exo9Playlist;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        Command playslistAdd = new PlaylistAddCommand(playlist);
        Command playlistDel = new PlaylistDeleteCommand(playlist);
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(playslistAdd);
        remoteControl.pressButton("Libéré Délivré");
        remoteControl.pressButton("Hakuna Matata");

        System.out.println();
        System.out.println("Playslist 🎶");
        playlist.readPlaylist();

        System.out.println();
        remoteControl.setCommand(playlistDel);
        remoteControl.pressButton("Comme un homme");
        remoteControl.pressButton("Hakuna Matata");

        System.out.println();
        System.out.println("Playslist 🎶");
        playlist.readPlaylist();

    }
}
