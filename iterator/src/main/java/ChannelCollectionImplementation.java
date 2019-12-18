import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImplementation implements ChannelCollection {
    private List<Channel> channels;

    public ChannelCollectionImplementation() {
        channels = new ArrayList<Channel>();
    }

    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    public void removeChannel(Channel channel) {
        channels.remove(channel);
    }

    public ChannelIterator iterator() {
        return new ChannelIteratorImplementation(this.channels);
    }


}
