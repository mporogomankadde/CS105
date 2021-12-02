package chapter5;

public class TestBook {

	public static void main(String[] args) {
		Book book1=new Book("cashflow","Ronnie",200,12);
		System.out.println(book1.getPrice());
		System.out.println(book1.getQuantity());
		book1.writOutput();
		book1.setPrice(500.00);
		book1.setQuantity(56);
		book1.writOutput();
	}

}
