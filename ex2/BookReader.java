import java.util.Arrays;

import objects.Book;
import objects.Reader_Printer;

public class BookReader {
    public static void main(String[] args) {
        Book book = new Book("Tyland", Arrays.asList("I", "moved", "here", "recently", "too"));
        book.print(new Reader_Printer());
    }
}
