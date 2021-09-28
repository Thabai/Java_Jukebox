package Jukebox;

import java.util.LinkedList;
import java.util.List;

public class Playlist {
    private List<Song> playlistSongs = new LinkedList<>();
    private String name;
    private int playlistSongNo;

    public Playlist() {
        this.addToPlaylist(new Song ("Party Time", "Party 2000"));
        this.addToPlaylist(new Song ("Panchitos Song", "Panchos"));
        this.name = "default";
        this.playlistSongNo = 2;
    }

//    public void play() {
//        for (Song checkedSong : this.playlistSongs) {
//            checkedSong.play();
//        }
//    }
//
//    public Song getPlayingSong(){
//        for (Song checkedSong : this.playlistSongs) {
//            if (checkedSong.getPlaying()) {
//                return checkedSong;
//            }
//        }
//        return null;
//    }

        public String getPlaylistSong(String Track) {

            for (Song checkedSong : this.playlistSongs) {
                if (checkedSong.getTrack().equals(Track)) {
                    return "Now playing " + checkedSong.getTrack();
                }
            }
            return null;
        }

//    public String getSongsFromInsideAlbum() {
//
//        for (int i = 0; i < this.albumSongs.size(); i++) {
//            return ("    " + this.albumSongs.get(i).getTrack());
//        }
//        return null;
//        }

    public void addToPlaylist(Song song) {
        if (song != null) {
            this.playlistSongs.add(song);
        }
    }

    //cucumber///
    public Boolean getPlaySong(String Track) {

        for (Song checkedSong : this.playlistSongs) {
            if (checkedSong.getTrack().equals(Track)) {
                return true;
            }
        }
        return false;
    }
}
