import java.util.HashMap;
import java.util.Map;

public class SticknoteFactory {
    static Map<String, SticknoteType> sticknoteTypes = new HashMap<String, SticknoteType>();

    public static SticknoteType getSticknoteType(String color, int width, int height) {
        SticknoteType result = sticknoteTypes.get(color);
        if(result == null) {
            result = new SticknoteType(color, width, height);
            sticknoteTypes.put(color, result);
        }
        return result;
    }
}
