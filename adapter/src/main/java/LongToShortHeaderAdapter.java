public class LongToShortHeaderAdapter {

    private LongHeader longHeader;

    public LongToShortHeaderAdapter(LongHeader longHeader) {
        this.longHeader = longHeader;
    }

    private String CompressPayload(String payload) {
        return payload; // just for simplicity reason
    }

    public String GenerateShortHeader() {
        String address = longHeader.getAddress();
        int payloadSize = longHeader.getPayloadSize();
        String payload = longHeader.getPayload();
        String compressedPayload = CompressPayload(payload);
        ShortHeader shortHeader = new ShortHeader(address, payloadSize, compressedPayload);

        return shortHeader.GenerateHeader();
    }
}
