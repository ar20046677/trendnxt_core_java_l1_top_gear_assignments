public class Topic3_Assign5 {

	public static void main(String[] args) {
		
		String str = "Haha that's funny. ";
		char c ='n';
		int lengthStr = str.length();
		int lengthNewStr = 0;
		int numOfOccur = 0;
		
		// replace all c with nothing
		
		lengthNewStr = str.replaceAll(Character.toString(c),"").length();
		numOfOccur = lengthStr - lengthNewStr;
		System.out.println("Number of " + Character.toString(c) + ": " + numOfOccur);
	}
	

}
