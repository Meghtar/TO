import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LongToShortHeaderAdapterTest {

    @Test
    public void CreatingShortHeaderTest() {
        ShortHeader shortHeader = new ShortHeader("address", 1000, "payload");

        assertEquals(shortHeader.getAddress(), "address");
        assertEquals(shortHeader.getPayloadSize(), 1000);
        assertEquals(shortHeader.getCompressedPayload(), "payload");
    }

    @Test
    public void CreatingLongHeaderTest() {
        LongHeader longHeader = new LongHeader("address", 1000, "payload", "1.0");

        assertEquals(longHeader.getAddress(), "address");
        assertEquals(longHeader.getPayloadSize(), 1000);
        assertEquals(longHeader.getPayload(), "payload");
        assertEquals(longHeader.getProtocolVersion(), "1.0");
    }

    @Test
    public void LongToShortHeaderAdapterSimpleTest() {
        ShortHeader shortHeader = new ShortHeader("target", 10, "some data to be sent");

        LongHeader longHeader = new LongHeader("target", 10, "some data to be sent", "1.0");

        assertNotEquals(shortHeader.GenerateHeader(), longHeader.GenerateHeader());

        LongToShortHeaderAdapter longToShortHeaderAdapter = new LongToShortHeaderAdapter(longHeader);

        assertEquals(shortHeader.GenerateHeader(), longToShortHeaderAdapter.GenerateShortHeader());
    }
}
