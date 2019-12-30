import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {

    @Test
    void subscribeTest() {
        NewsServer newsServer = new NewsServer();
        NewsSubscriber subscriber = new NewsSubscriber();

        assertEquals(0, newsServer.getSubscribersAmount());

        newsServer.subscribe(subscriber);

        assertEquals(1, newsServer.getSubscribersAmount());
    }

    @Test
    void unsubscribeTest() {
        NewsServer newsServer = new NewsServer();
        NewsSubscriber subscriber = new NewsSubscriber();

        newsServer.subscribe(subscriber);

        assertEquals(1, newsServer.getSubscribersAmount());

        newsServer.unsubscribe(subscriber);

        assertEquals(0, newsServer.getSubscribersAmount());
    }

    @Test
    void simpleNotifyTest() {
        NewsServer newsServer = new NewsServer();
        NewsSubscriber subscriber = new NewsSubscriber();
        newsServer.subscribe(subscriber);

        newsServer.notifySubscribers(100);

        assertEquals(100, subscriber.getLatestUpdateId());
    }


}
