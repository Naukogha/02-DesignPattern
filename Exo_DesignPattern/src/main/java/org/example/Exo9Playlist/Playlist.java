package org.example.Exo9Playlist;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    List<String> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String title){
        songs.add(title);
        System.out.println("Chanson ajoutée : " +title);
    }

    public void deleteSong(String title){
        boolean songFound = songs.removeIf(song -> song.equalsIgnoreCase(title));

        if (songFound) {
            System.out.println("Chanson supprimée : " + title);
        } else {
            System.out.println("Chanson non trouvée : " + title);
        }


    }

    public void readPlaylist(){
        for (String song : songs){
            System.out.println("- " + song);
        }
    }
}
