public class LongHeader {

    private String address;
    private int payloadSize;
    private String payload;
    private String protocolVersion;

    public LongHeader(String address, int size, String payload, String protocol_version) {
        this.address = address;
        this.payloadSize = size;
        this.payload = payload;
        this.protocolVersion = protocol_version;
    }

    public String GenerateHeader() {
        return "L" + payloadSize + protocolVersion + address + payload;
    }

    public String getAddress() {
        return address;
    }

    public int getPayloadSize() {
        return payloadSize;
    }

    public String getPayload() {
        return payload;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }
}
