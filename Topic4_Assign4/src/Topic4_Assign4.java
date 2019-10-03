import java.util.*;

public class Topic4_Assign4 {

	public static void main(String[] args) {
		HashMap<String, String> telephoneBook = new HashMap<String, String>();
		// add to the telephone book
		telephoneBook.put("Jaison", "972-540-4057");
		telephoneBook.put("Kiara", "469-231-9251");
		telephoneBook.put("Anjula", "212-456-7395");
		telephoneBook.put("Luis", "346-756-1432");
		
		System.out.println("Kiara's #: " + telephoneBook.get("Kiara"));
	}

}
