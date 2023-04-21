package Observer;

public class Follower implements Observer {

    private String followerName;

    // Constructor
    public Follower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String status) {
        System.out.println("Informing observer " + followerName + " that channel status is " + status);
    }

    public void play() {
        System.out.println("Playing!");
    }

}
