public class ShortHeader {

    private String address;
    private int payloadSize;
    private String compressedPayload;

    public ShortHeader(String address, int size, String payload) {
        this.address = address;
        this.payloadSize = size;
        this.compressedPayload = payload;
    }

    public String GenerateHeader() {
        return "S" + payloadSize + address + compressedPayload;
    }

    public String getAddress() {
        return address;
    }

    public int getPayloadSize() {
        return payloadSize;
    }

    public String getCompressedPayload() {
        return compressedPayload;
    }
}
