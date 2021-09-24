package JukeboxTests;

import Jukebox.Album;
import Jukebox.Song;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumTest {

//    @Test
//    public void testGetSetSongs() {
//
//        Album testSongs = new Album(new ArrayList<Song>(), "Surfin USA", "Beach Boys");
////        testSongs.setSongs(new ArrayList<Song>());
//        assertEquals(testSongs, testSongs.getSongs(), "No Songs");
//    }


    @Test
    public void testGetSetArtist(){

        Album testSongs = new Album( new ArrayList<Song>() ,"test", "test");
        testSongs.setArtist("Beach Boys");
        assertEquals("Beach Boys", testSongs.getArtist(),"No Artist set");
        }


    @Test
    public void testGetSetTitle(){

        Album testSongs = new Album( new ArrayList<Song>() ,"test", "test");
        testSongs.setTitle("Surfin USA");
        assertEquals("Surfin USA", testSongs.getTitle(),"No Title set");
    }
    }


