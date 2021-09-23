package Jukebox;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Playlist {

    List<Album> playlist = new LinkedList<Album>();

    public Playlist () {
    List<Song> tracks = new ArrayList<Song>();

    Song track1 = new Song("Track 1", "Artist 1");

    Song aTrack1 = new Song("Album Track 1", "Artist 2");
    Song aTrack2 = new Song("Album Track 2", "Artist 2");

        tracks.add(aTrack1);
        tracks.add(aTrack2);

    Album album1 = new Album(tracks, "Album Title 1");

        playlist.add(track1);
        playlist.add(album1);
        playlist.add(track1);
        playlist.add(album1);
        playlist.add(album1);
        playlist.add(track1);
        playlist.add(track1);
}
}
