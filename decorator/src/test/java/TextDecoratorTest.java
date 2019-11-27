import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TextDecoratorTest {

    @Test
    public void HeaderDecoratorTest() {
        Text text = new ConcreteText("sample text");

        assertEquals("sample text", text.getContent());

        text = new HeaderDecorator(text);

        assertEquals("[TEXT]sample text", text.getContent());
    }

    @Test
    public void FooterDecoratorTest() {
        Text text = new ConcreteText("sample text");

        assertEquals("sample text", text.getContent());

        text = new FooterDecorator(text);

        assertEquals("sample text[/TEXT]", text.getContent());
    }
}