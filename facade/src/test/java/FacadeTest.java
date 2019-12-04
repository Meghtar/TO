import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacadeTest {

    @Test
    void BigAddersTest() {
        String text = "AAA";

        TextExtrasFacade facade = new TextExtrasFacade();

        String text1 = facade.AddExtrasToText(text, false);

        assertEquals("[HDR]AAA[/HDR]", text1);
    }

    @Test
    void SmallAddersTest() {
        String text = "AAA";

        TextExtrasFacade facade = new TextExtrasFacade();

        String text1 = facade.AddExtrasToText(text, true);

        assertEquals("[hdr]AAA[/hdr]", text1);
    }
}
