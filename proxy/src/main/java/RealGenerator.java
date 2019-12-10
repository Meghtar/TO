import java.util.HashMap;
import java.util.Map;

public class RealGenerator implements StringFromDigitGenerator {

    private Map<Integer, String> Data;

    RealGenerator() {
        Data = new HashMap<Integer,String>();
        Data.put(0,"Zero");
        Data.put(1,"One");
        Data.put(2,"Two");
        Data.put(3,"Three");
        Data.put(4,"Four");
        Data.put(5,"Five");
        Data.put(6,"Six");
        Data.put(7,"Seven");
        Data.put(8,"Eight");
        Data.put(9,"Nine");
    }

    public String Generate(Integer digit) {
        return Data.get(digit);
    }
}
