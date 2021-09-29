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
        testSongs.setAlbum(new LinkedList<Song>(),  "Sorry for Party Rocking", "LMFAO");
        assertEquals("Now playing from the album Sorry for Party Rocking by the artist LMFAO", testSongs.getAlbum(),"No album songs");
    }

    @Test
    public void testGetSetArtist(){

        Album testSongs = new Album( new LinkedList<Song>() , "test", "test");
        testSongs.setAlbumArtist("Beach Boys");
        assertEquals("Beach Boys", testSongs.getAlbumArtist(),"No Artist set");
        }


    @Test
    public void testGetSetTitle(){

        Album testSongs = new Album( new LinkedList<Song>() ,"test", "test");
        testSongs.setAlbumTitle("Surfin USA");
        assertEquals("Surfin USA", testSongs.getAlbumTitle(),"No Title set");
    }

//    @Test
//    public void testGetSetSongNumber(){
//
//        Album testSongs = new Album( new LinkedList<Song>() ,1,"test", "test");
//        testSongs.setSongNumber(4);
//        assertEquals(4, testSongs.getSongNumber(),"No Title set");
//    }

    @Test
    public void testGetSetSongs(){
        Album testSongs = new Album(new LinkedList<Song>(), "Surfin USA", "Beach Boys");
        testSongs.addAlbumSong("Party Rocking", "LMFAO");
        assertEquals("Song available Party Rocking", testSongs.songAvailable("Party Rocking"),"Song not found");
    }
    }


