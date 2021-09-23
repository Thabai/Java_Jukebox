package Jukebox;

import java.util.List;

public class Album extends Playlist{
        private List<Song> Songs;
        private String Title;
        private String Artist;

        public Album (List<Song> songs, String Title, String Artist){
            this.Songs = songs;
            this.Title = Title;
            this.Artist = Artist;
        }


    public List<Song> getSongs() {
        return Songs;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String addSong() {
        this.Songs = songs;
    }


}
