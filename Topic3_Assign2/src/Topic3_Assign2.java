
public class Topic3_Assign2 {

	// 
	// name grade grade grade name grade grade grade
	public static void main(String[] args) {
		try{
			// args[1-3] student 1, args[5-7] student 2
			double avg1 = (Integer.parseInt(args[1]) + Integer.parseInt(args[2]) + Integer.parseInt(args[3]))/3;
			double avg2 = (Integer.parseInt(args[5]) + Integer.parseInt(args[6]) + Integer.parseInt(args[7]))/3;;
			System.out.println("Average of " + args[0] +": " + avg1 );
			System.out.println("Average of " + args[4] +": " + avg2 );
		}
		catch(NumberFormatException e){
			System.out.println("Not a number. ");
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Not enough arguments.");
		}
	}

}
