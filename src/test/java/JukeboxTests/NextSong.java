//package JukeboxTests;
//
//import Jukebox.Playlist;
//import Jukebox.Song;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class NextSong {
//    private Boolean nextAvailable;
//    private String actualAnswer;
//
//    static String nextSong (String nextAvailable) {
//
//    }
//
//
//    @Given("the jukebox has another song in the playlist")
//    public void theJukeboxHasAnotherSongInThePlaylist() {
//        nextAvailable = "Party Time";
//    }
//
//    @Given("the jukebox doesn't have another song in the playlist")
//    public void theJukeboxDoesnTHaveAnotherSongInThePlaylist() {
//        nextAvailable = "Panchitos Song";
//    }
//
//    @When("the person changes to next song")
//    public void the_person_tries_to_change_song() {
//    }
//
//    @Then("the next song should play")
//    public void song_should_play() {
//        actualAnswer = nextSong(nextAvailable);
//        assertEquals("Yes", actualAnswer);
//    }
//
//    @Then("the person should be told the next song is not available")
//    public void next_song_is_not_available() {
//        actualAnswer = nextSong(nextAvailable);
//        assertEquals("No", actualAnswer);
//    }
//}
