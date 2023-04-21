package Observer;

import java.util.ArrayList;

public class Channel implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private String channelName;
    private String status;

    // Constructor
    public Channel(String channelName) {

        this.channelName = channelName;
        this.status = "Initial status";

    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.status);
        }
    }
}
