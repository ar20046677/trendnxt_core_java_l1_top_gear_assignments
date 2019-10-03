import java.util.Date;
import java.util.Timer;


public class Topic4_Assign2 {

	public static void main(String[] args) {
	    try {
	    	int i = 0;
	    	int numOfSec = 2;
	    	int duration = 20;
	    	int left = duration/numOfSec;
	        while (left != 0) {
	            System.out.println(java.time.LocalTime.now());
	            Thread.sleep(numOfSec * 1000);
	            left -= 1;
	        }
	        System.out.println("Program exiting...");
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	

}




