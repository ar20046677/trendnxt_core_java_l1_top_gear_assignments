
public class Topic2_Assign3 {

	public static void main(String[] args) {
		Magazine mag = new Magazine("978-1-4262-9635-2", "National Geographic", 20.00, "Nature");
		Novel novel = new Novel("9780374528379", "The Brothers Karamazov", 20.00, "Fyodor Dostoevsky");
		
		mag.displayDetails();
		System.out.println();
		novel.displayDetails();
	}

}
