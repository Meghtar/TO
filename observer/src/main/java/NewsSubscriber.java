public class NewsSubscriber implements Subscriber {
    private int latestUpdateId;

    public NewsSubscriber() {
        latestUpdateId = 0;
    }

    public void update(int updateId) {
        this.latestUpdateId = updateId;
    }

    public int getLatestUpdateId() {
        return latestUpdateId;
    }
}
