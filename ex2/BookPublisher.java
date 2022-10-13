import java.util.Arrays;

import objects.Book;
import objects.Publisher_Printer;

public class BookPublisher {
    public static void main(String[] args) {
        Book book = new Book("Tyland", Arrays.asList("I", "moved", "here", "recently", "too"));
        book.print(new Publisher_Printer());
    }
}
