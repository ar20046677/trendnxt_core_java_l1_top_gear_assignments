
public class Book {
	private String isbn;
	private String title;
	private double price;
	
	public Book(String isbn, String title, double price){
		this.setIsbn(isbn);
		this.setTitle(title);
		this.setPrice(price);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void displayDetails(){
		System.out.println("ISBN: " + isbn);
		System.out.println("Title: " + title);
		System.out.println("Price: " + price);
	}


	
}
