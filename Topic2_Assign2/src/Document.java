
public class Document {
	private String text = "";
	// constructor
	Document(String text){
		this.text = text;
	}
	// getter method
	public String toString(){
		return text;
	}
	
	// setter method
	public void setText(String text){
		this.text = text;
	}
}
