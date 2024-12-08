package org.example.Exo9Playlist;

public class PlaylistAddCommand implements Command{
    private Playlist playlist;

    public PlaylistAddCommand(Playlist playlist){
        this.playlist = playlist;
    }

    @Override
    public void execute(String title){
        playlist.addSong(title);
    }
}
