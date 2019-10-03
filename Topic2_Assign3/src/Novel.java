
public class Novel extends Book {
	private String author;
	public Novel(String isbn, String title, double price, String author) {
		super(isbn, title, price);
		this.setAuthor(author);
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Author: " + author);
	}



}
