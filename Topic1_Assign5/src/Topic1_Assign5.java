import java.util.Scanner;

public class Topic1_Assign5 {

	public static void main(String[] args) {
		int in = 0;
		int num = 0;
		int p = 0;
		int sumNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in 4-digit number: ");
		in = sc.nextInt();
		sc.close();
		
		num = in;
		while(num != 0 ){
			// grab the last digit and store it
			p = num % 10;
			num = (int)num / 10;
			
			
			// add it to current sum sumNum
			sumNum += p;
		}
		
		System.out.print("Sum of " + in + " is: " + sumNum);

	}

}
