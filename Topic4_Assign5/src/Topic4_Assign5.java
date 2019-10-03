import java.util.*;

public class Topic4_Assign5 {

	public static void main(String[] args) {
		HashSet<String> employees = new HashSet<String>();
		employees.add("Jenny");
		employees.add("Juan");
		employees.add("Jorge");
		employees.add("Mena");
		employees.add("Musa");
		
        Iterator<String> i=employees.iterator();  
        while(i.hasNext())  
        {  
        	System.out.println(i.next());  
        }  

	}

}
