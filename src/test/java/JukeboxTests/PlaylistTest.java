package JukeboxTests;

import Jukebox.Playlist;
import Jukebox.Song;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistTest {
//    @Test
//    public void testGetAddPlaylistInfo(){
//        Playlist testPlay = new Playlist();
//        testPlay.addToPlaylist(new Song ("Party Time", "Party 2000"));
//        assertEquals("boop 1", testPlay.getPlaylistTitleNo(),"No Artist");
//    }

    @Test
    public void testPlaylistSongs(){
        Playlist testPlay = new Playlist();
        testPlay.addToPlaylist(new Song ("Rap God", "Eminem"));
        assertEquals("Now playing Rap God", testPlay.getPlaylistSong("Rap God"),"No Artist");
    }

}
