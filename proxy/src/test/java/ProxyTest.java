import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProxyTest {

    @Test
    public void GeneratorTest() {
        Proxy proxy = new Proxy();

        String tmp = proxy.Generate(8);

        assertEquals(tmp, "Eight");
    }

    @Test
    public void LoadToCacheTest() {
        Proxy proxy = new Proxy();

        proxy.Generate(0);
        proxy.Generate(1);

        assertEquals(proxy.getKeysInCache().size(), 2);
    }

    @Test
    public void OverloadCacheTest() {
        Proxy proxy = new Proxy();

        proxy.Generate(0);
        proxy.Generate(1);
        proxy.Generate(2);
        proxy.Generate(3);
        proxy.Generate(4);
        proxy.Generate(5);
        proxy.Generate(6);
        proxy.Generate(7);
        proxy.Generate(8);
        proxy.Generate(9);

        assertEquals(proxy.getKeysInCache().size(), 2);
    }

    @Test
    public void ProperInCacheTest() {
        Proxy proxy = new Proxy();

        proxy.Generate(5);

        boolean isInCache = proxy.isInCache(5);

        assertEquals(true, isInCache);
    }

    @Test
    public void UsedDataFromCacheTest() {
        Proxy proxy = new Proxy();

        proxy.Generate(3);
        proxy.Generate(3);

        assertEquals(proxy.getKeysInCache().size(), 1);
    }
}
