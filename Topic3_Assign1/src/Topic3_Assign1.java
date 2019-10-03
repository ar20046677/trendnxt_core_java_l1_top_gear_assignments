
public class Topic3_Assign1 {

	public static void main(String[] args) {
		try{
			
			if(Integer.parseInt(args[1])<18 || Integer.parseInt(args[1])>=60){
				throw new MyException("Number is out of range");
			}
			
			else{
				System.out.println("Number is within range.");
			}
		}
		// if number is out of range
		catch(MyException e){
			System.out.println(e.getMessage());
		
		}
		// if second argument is not a number
		catch(NumberFormatException e){
			System.out.println("Second argument is not a number.");
		}

	}

}

class MyException extends Exception{
	public MyException(String s){
		super(s);
	}
}
