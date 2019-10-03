
public class Topic3_Assign3 {

	public static void main(String[] args) {
		try{
			double avg = 0;
			for(int i = 0; i<5; i++){
				avg += Integer.parseInt(args[i]);
			}
			avg = avg/3;
			System.out.println("Average: " + avg);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("You entered less than 5 integers.");
		}
		catch(NumberFormatException e){
			System.out.println("You didn't enter only integers.");
		}
	}

}
