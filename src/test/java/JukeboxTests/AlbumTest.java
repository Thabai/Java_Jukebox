package JukeboxTests;

import Jukebox.Album;
import Jukebox.Song;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumTest {

    @Test
    public void testGetSetAlbum() {
        Album testSongs = new Album(new LinkedList<Song>(), "Surfin USA", "Beach Boys");
        testSongs.setAlbum(testSongs.addAlbumSong("Party Rock Anthem", "LMFAO"), "Sorry for Party Rocking", "LMFAO");
        assertEquals("Now playing from the album Sorry for Party Rocking by the artist LMFAO", testSongs.getAlbum(),"No album songs");
    }


    @Test
    public void testGetSetArtist(){

        Album testSongs = new Album( new LinkedList<Song>() ,"test", "test");
        testSongs.setArtist("Beach Boys");
        assertEquals("Beach Boys", testSongs.getArtist(),"No Artist set");
        }


    @Test
    public void testGetSetTitle(){

        Album testSongs = new Album( new LinkedList<Song>() ,"test", "test");
        testSongs.setTitle("Surfin USA");
        assertEquals("Surfin USA", testSongs.getTitle(),"No Title set");
    }
    }


