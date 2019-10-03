
public class Email extends Document{
	private String sender;
	private String recipent;
	private String title;
	
	Email(String text, String sender, String recipent, String title) {
		super(text);
		this.sender = sender;
		this.recipent = recipent;
		this.title = title;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipent() {
		return recipent;
	}

	public void setRecipent(String recipent) {
		this.recipent = recipent;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString(){
	return "Sender: " + getSender() + "\n" + 
			"Recipent: " + getRecipent() + "\n" +
			"Title: " + getTitle() + "\n" +
			"Text: " + super.toString();
	}

}
