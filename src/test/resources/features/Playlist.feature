Feature: Add song to playlist

  Scenario: Person adds song to playlist when song is available
    Given the song is available
    When the person tries to add the song "Party Time" to the playlist
    Then song should show in the playlist

  Scenario: Person adds song to playlist when song is not available
    Given the song is not available
    When the person tries to add the song "Hip Hop Party" to the playlist
    Then the person should be told the song is not available

#Feature: Play next song in playlist
#
#  Scenario: Person listening to song wants to play the next song in playlist
#    Given the jukebox has another song in the playlist
#    When the person changes to next song
#    Then the next song should play
#
#  Scenario: Person listening to song wants to play the next song in playlist when next song is not available
#    Given the jukebox doesn't have another song in the playlist
#    When the person changes to next song
#    Then the person should be told the next song is not available