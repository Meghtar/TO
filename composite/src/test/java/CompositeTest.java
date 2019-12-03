import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeTest {

    @Test
    void OneItemInBoxTest() {
        BoxComposite composite = new BoxComposite(10, "box");
        composite.add(new SingleItem(15, "HammerItem"));

        assertEquals(25, composite.getPrice());
    }

    @Test
    void BoxInBoxTest() {
        BoxComposite outerBox = new BoxComposite(100, "outer");
        outerBox.add(new BoxComposite(50, "inner"));

        assertEquals(150, outerBox.getPrice());
    }

    @Test
    void SimpleTreeTest() {
        BoxComposite root = new BoxComposite(100, "root");
        root.add(new SingleItem(10, "First item"));

        BoxComposite inner = new BoxComposite(100, "Inner box");
        inner.add(new SingleItem(20, "Second item"));
        inner.add(new SingleItem(30, "Third item"));

        root.add(inner);

        assertEquals(260, root.getPrice());
    }
}
