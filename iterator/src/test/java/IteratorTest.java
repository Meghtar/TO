import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorTest {

    static ChannelCollection prepareChannels() {
        ChannelCollection channels = new ChannelCollectionImplementation();

        channels.addChannel(new Channel(1,"TV1"));
        channels.addChannel(new Channel(5,"TV2"));
        channels.addChannel(new Channel(10,"TV3"));
        channels.addChannel(new Channel(11,"TV4"));

        return channels;
    }

    @Test
    void properNumbers() {
        ChannelCollection channels = prepareChannels();
        ChannelIterator iterator = channels.iterator();

        List<Integer> numbers = new ArrayList<Integer>();

        while(iterator.hasNext()) {
            Channel channel = iterator.next();
            numbers.add(channel.getNumber());
        }

        assertEquals(4, numbers.size());

        assertEquals(1,numbers.get(0));
        assertEquals(5,numbers.get(1));
        assertEquals(10,numbers.get(2));
        assertEquals(11,numbers.get(3));
    }

    @Test
    void properNames() {
        ChannelCollection channels = prepareChannels();
        ChannelIterator iterator = channels.iterator();

        List<String> names = new ArrayList<String>();

        while(iterator.hasNext()) {
            Channel channel = iterator.next();
            names.add(channel.getName());
        }

        assertEquals(4, names.size());

        assertEquals("TV1",names.get(0));
        assertEquals("TV2",names.get(1));
        assertEquals("TV3",names.get(2));
        assertEquals("TV4",names.get(3));
    }
}
