import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Proxy implements StringFromDigitGenerator {

    private Map<Integer, String> Cache; // assuming that max Cache size is 2

    public Proxy() {
        Cache = new LinkedHashMap<Integer, String>();
    }

    public String Generate(Integer digit) {
        if(!isInCache(digit)) {
            RealGenerator generator = new RealGenerator();
            String generated = generator.Generate(digit);

            if(Cache.keySet().size() >= 2) { // there is no place in Cache
                int key = Cache.entrySet().iterator().next().getKey();
                Cache.remove(key);
            }
            Cache.put(digit,generated);

            return generated;
        }
        return Cache.get(digit);
    }

    public boolean isInCache(Integer digit) {
        if(Cache.isEmpty() || !Cache.containsKey(digit)) {
            return false;
        }
        return true;
    }

    public Set<Integer> getKeysInCache() {
        return Cache.keySet();
    }
}
