import java.util.ArrayList;
import java.util.List;

public class NewsServer {
    private List<Subscriber> subscribers;

    public NewsServer() {
        subscribers = new ArrayList<Subscriber>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(int updateId) {
        for(Subscriber subscriber : subscribers) {
            subscriber.update(updateId);
        }
    }

    public int getSubscribersAmount() {
        return subscribers.size();
    }
}
