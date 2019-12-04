public class BigHeaderAdder implements HeaderAdder {

    public String addHeader(String text) {
        return "[HDR]" + text;
    }
}
