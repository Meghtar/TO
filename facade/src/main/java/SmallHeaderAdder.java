public class SmallHeaderAdder implements HeaderAdder{

    public String addHeader(String text) {
        return "[hdr]" + text;
    }

}
