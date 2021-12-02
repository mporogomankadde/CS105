package chapter5;

public class Book {
	private String tittle;
	private String author;
	private double price;
	private int quantity;
	Book(String tittle,String author,double price,int quantity){
		this.tittle=tittle;
		this.author=author;
		this.price=price;
		this.quantity=quantity;		
	}
	
	public double totalPrice() {
		return price*quantity;
		
	}
	public void writOutput() {
		System.out.println("The tittle is "+ tittle + " \nThe author is "+author+ " \nThe price is "+price+" \nThe quantity is "+quantity);
	}
	public double getPrice() {
		return price; 
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
} 
