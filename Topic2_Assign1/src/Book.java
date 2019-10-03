
public class Book {
	private String isbn;
	private String title;
	private String author;
	private double price;
	
	Book(String isbn, String title, String author, double price){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayDetails(){
		System.out.println("ISBN: " + isbn);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
	
	public void discountedPrice(double percent){
		double discount = price * (percent/100);
		System.out.println("Price after discount: $" + (price- discount));
	}
}
