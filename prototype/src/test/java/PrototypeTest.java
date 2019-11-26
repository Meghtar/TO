import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PrototypeTest {

    @Test
    public void ClonePrototypeDocumentTest() {
        PrototypePaper paper = new PrototypeDocument("some text", "John", "Project specification");

        PrototypePaper clonedPaper = paper.clone();

        assertEquals(paper.getText(), clonedPaper.getText());
        assertEquals(paper.getAuthor(), clonedPaper.getAuthor());
        assertEquals(((PrototypeDocument) paper).getTopic(), ((PrototypeDocument) clonedPaper).getTopic());
    }

    @Test
    public void ClonePrototypePageTest() {
        PrototypePaper paper = new PrototypePage("some text", "John", 3 );

        PrototypePaper clonedPaper = paper.clone();

        assertEquals(paper.getText(), clonedPaper.getText());
        assertEquals(paper.getAuthor(), clonedPaper.getAuthor());
        assertEquals(((PrototypePage) paper).getAmountOfPictures(), ((PrototypePage) clonedPaper).getAmountOfPictures());
    }

    @Test
    public void ClonesAreDifferentObjectsTest() {
        PrototypePaper paper = new PrototypePage("some text", "John", 3 );

        PrototypePaper clonedPaper = paper.clone();

        assertNotEquals(paper.hashCode(), clonedPaper.hashCode());
    }
}
