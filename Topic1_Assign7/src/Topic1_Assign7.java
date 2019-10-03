import java.util.Scanner;

public class Topic1_Assign7 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a number: ");
		num = sc.nextInt();
		sc.close();
		
		System.out.println(factorial(num));
	}
	
	public static int factorial(int num){
		if(num == 1){
			return 1;
		}
		else{
			return num * factorial(num-1);
		}
		
	}

}
