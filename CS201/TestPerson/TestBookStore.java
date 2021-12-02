package TestPerson;

import java.awt.print.Book;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class TestBookStore {
    public static void main(String[] args) {
        BookStore book= new BookStore (115,"kids","ronie","love","ann",230,5);

        book.trackSalesStatus();
        System.out.println( book.getQuantity(115));

    }
}
