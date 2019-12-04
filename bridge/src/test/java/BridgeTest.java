import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BridgeTest {

    @Test
    void BlueRectangleTest() {
        Shape shape = new Rectangle(new Blue());
        assertEquals("blue rectangle", shape.getShapeInfo());
    }

    @Test
    void RedCircleTest() {
        Shape shape = new Circle(new Red());
        assertEquals("red circle", shape.getShapeInfo());
    }
}
