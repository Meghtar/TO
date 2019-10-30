package factory;

import book.Book;
import book.CookBook;
import book.HorrorBook;
import book.MathBook;

public abstract class BookFactory {
    public static Book getBook(String bookType) {
        Book book = null;
        if (bookType.equals("Cook")) {
            book = new CookBook();
        }
        else if (bookType.equals("Horror")) {
            book = new HorrorBook();
        }
        else if(bookType.equals("Math")) {
            book = new MathBook();
        }
        return book;
    }
}
