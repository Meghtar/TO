import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SticknoteTest {

    @Test
    void CreateGreenStickNotesTest() {
        Notes notes = new Notes();

        notes.addStickNote(10,10,"Green","First note");
        notes.addStickNote(10,10,"Green","Second note");

        assertEquals(notes.getNotes(),"10x10 Green First note\n10x10 Green Second note\n");
    }
}
