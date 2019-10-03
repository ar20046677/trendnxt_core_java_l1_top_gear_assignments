// !!!!!!!! use command line for argument
public class Topic3_Assign4 {

	
	public static void main(String[] args) {
		int b=0;
		int e=args[0].length()-1;
		boolean isP= true;

		while(b<e && isP==true){
			// System.out.println("b: " + b + ", " + "e: " + e);
			if(Character.toLowerCase(args[0].charAt(b)) != Character.toLowerCase(args[0].charAt(e))){
				isP=false;
			}
			else{
				b++;
				e--;
			}
		}
		System.out.println(args[0] + " is a" + (isP ? " palindrome. ":" not a palindrome."));
		
	}

}
