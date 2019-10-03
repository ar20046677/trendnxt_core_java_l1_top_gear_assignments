
public class Magazine extends Book{
	private String type;
	Magazine(String isbn, String title, double price, String type) {
		super(isbn, title, price);
		this.setType(type);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public void displayDetails(){
		super.displayDetails();
		System.out.println("Type: " + type);
	}
}
