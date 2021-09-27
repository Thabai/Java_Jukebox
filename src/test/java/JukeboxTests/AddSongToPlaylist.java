package JukeboxTests;

import Jukebox.Album;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddSongToPlaylist {
    static String playSong (String songAvailable) {
        return "Song added to playlist".equals(songAvailable) ? "Yes" : "No";
    }
}

