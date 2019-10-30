import book.Book;
import factory.BookFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookFactoryTest {
    @Test
    void CreateHorrorBookTest() {
        Book book = BookFactory.getBook("Horror");
        assertEquals("HorrorBook", book.getGenre());
    }

    @Test
    void ImpossibleToCreateBookTest() {
        Book book = BookFactory.getBook("non-existing");

        assertThrows(NullPointerException.class, () -> {book.getGenre();});
    }
}
