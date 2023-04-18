package Component;

import java.util.ArrayList;

public class Playlist implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }

    public void play() {
        for (IComponent component : this.playlist) {
            component.play();
        }
    }

    public void setPlaybackSpeed(float speed) {
        for (IComponent component : this.playlist) {
            component.setPlaybackSpeed(speed);
        }
    }

    public String getName() {
        return this.playlistName;
    }

    public void remove(IComponent component) {
        this.playlist.remove(component);
    }

}
