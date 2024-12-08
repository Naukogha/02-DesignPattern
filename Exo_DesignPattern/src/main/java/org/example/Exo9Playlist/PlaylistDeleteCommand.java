package org.example.Exo9Playlist;

public class PlaylistDeleteCommand implements Command{
    private Playlist playlist;

    public PlaylistDeleteCommand(Playlist playlist){
        this.playlist = playlist;
    }

    @Override
    public void execute(String title){
        playlist.deleteSong(title);
    }
}