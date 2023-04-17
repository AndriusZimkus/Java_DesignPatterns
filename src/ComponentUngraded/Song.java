package ComponentUngraded;

public class Song implements IComponent {

    public String songName;
    public String artist;
    public float speed = 1; // Default playback speed

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }


    // Getters
    public String getName() {
        return this.songName;
    }

    public String getArtist() {
        return this.artist;
    }

    // Other methods
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    public void play() {
        System.out.println("Playing song " + this.songName + " by " + this.artist + " with speed " + this.speed);
    }
}
