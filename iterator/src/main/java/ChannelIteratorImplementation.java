import java.util.List;

public class ChannelIteratorImplementation implements ChannelIterator {
    private List<Channel> channels;
    private int position;

    ChannelIteratorImplementation(List<Channel> channels) {
        this.channels = channels;
    }

    public boolean hasNext() {
        if(position < channels.size())
            return true;
        return false;
    }

    public Channel next() {
        return channels.get(position++);
    }
}
