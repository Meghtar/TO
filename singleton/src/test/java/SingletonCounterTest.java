import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonCounterTest {

    @Test
    public void isSameInstance() {
        SingletonCounter singletonCounter = SingletonCounter.getInstance();
        SingletonCounter singletonCounter2 = SingletonCounter.getInstance();

        assertEquals(singletonCounter.hashCode(), singletonCounter2.hashCode());
    }

    @Test
    public void incrementingTest() {
        int number = SingletonCounter.getInstance().getNumber();
        SingletonCounter.getInstance().IncrementCounter();
        int numberAfterIncrementing = SingletonCounter.getInstance().getNumber();

        assertEquals(number + 1, numberAfterIncrementing);
    }

    @Test
    public void decrementingTest() {
        int number = SingletonCounter.getInstance().getNumber();
        SingletonCounter.getInstance().DecrementCounter();
        int numberAfterDecrementing = SingletonCounter.getInstance().getNumber();

        assertEquals(number - 1 , numberAfterDecrementing);
    }
}
