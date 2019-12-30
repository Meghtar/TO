import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {

    @Test
    void toLowerStrategyTest() {
        Context context = new Context();

        String text = "AbC123DDDeee";

        context.setStrategy(new ToLowerStrategy());

        assertEquals(text.toLowerCase(), context.getChangedText(text));
    }

    @Test
    void toUpperStrategyTest() {
        Context context = new Context();

        String text = "AbC123DDDeee";

        context.setStrategy(new ToUpperStrategy());

        assertEquals(text.toUpperCase(), context.getChangedText(text));
    }
}
