import java.util.Scanner;

// convert minutes into number of years and days


public class Topic1_Assign3 {

	public static void main(String[] args) {
		double min = 0;
		double years = 0;
		double days = 0;
		double yearsAndDays = 0;
		// ask user for number of minutes to convert
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in minutes to convert: ");
		min = sc.nextDouble();
		sc.close();
		
		// convert min to years and days
		// 60 minutes in an hour, 24 hours in a day, 365 days in a normal year
		years = min/ (60*24*365);
		days = (int)(years*365) % 365;
		
		System.out.println((int)years + " years " + days + " days");

	}

}
