package TestPerson;

import java.util.Comparator;

public class BookStore implements Comparator<Person> {
    private int bookID;
    private String BookCategory;
    private String Author;
    private String Title;
    private String  Publisher;
    private int SellingPrice;
    private int Quantity;


    public BookStore(int bookID, String bookCategory, String author, String title,
                     String publisher, int sellingPrice, int quantity) {

        this.bookID = bookID;
        BookCategory = bookCategory;
        Author = author;
        Title = title;
        Publisher = publisher;
        SellingPrice = sellingPrice;
        Quantity = quantity;

    }

    public void trackSalesStatus(){
        System.out.println( Quantity-getQuantity(bookID));
    }

    public int getQuantity(int bookID) {
        return Quantity;
    }


    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}
