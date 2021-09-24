package Jukebox;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Playlist {

    List<Album> playlist = new LinkedList<Album>();
    List<Song> playlist2 = new ArrayList<Song>();

    public Playlist () {
    List<Song> tracks = new ArrayList<Song>();

    Song aTrack1 = new Song("Album Track 1", "Artist 2");
    Song aTrack2 = new Song("Album Track 2", "Artist 2");
    Song aTrack3 = new Song("Album Track 3", "Artist 1");

        tracks.add(aTrack1);
        tracks.add(aTrack2);
        tracks.add(aTrack3);

    Album album1 = new Album(tracks, "Album Title 1", "Billy");

        playlist.add(album1);
        playlist2.add(tracks.get(0));
        playlist.add(album1);
        playlist.add(album1);
        playlist2.add(tracks.get(3));
        playlist2.add(tracks.get(2));
}

//    public void getSongs() {
//
//        for (Playlist a : playlist2) {
//            System.out.println(a.getSongPlaying());
//        }
//    }
//
//        public void getSongs1() {
//
//            for (Playlist a : playlist) {
//                System.out.println(a.getAlbumPlaying());
//            }
//        }
}
