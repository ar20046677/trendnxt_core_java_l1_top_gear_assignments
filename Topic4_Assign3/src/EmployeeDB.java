import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	// why boolean?
	public boolean addEmployee(Employee e){
		return this.employees.add(e);
		
	}
	
	public boolean deleteEmployee(int eCode){
		return this.employees.removeIf(obj -> obj.getEmployeeID() ==(eCode));
		      
	}
	
	public String showPaySlip(int eCode){
		Iterator<Employee> iterator = employees.iterator();
	    while (iterator.hasNext()) {
	        Employee e = iterator.next();

	        if (e.getEmployeeID()==eCode) {
	            return e.showPaySlip();
	        }
	    }
		return "Employee doesn't exist.";
	}
	
	public Employee[] listAll(){
		Employee[] arr = new Employee[employees.size()];
		Iterator<Employee> iterator = employees.iterator();
		int i =0;
		while (iterator.hasNext()) {
	        Employee e = iterator.next();
	        arr[i] = e;
	        i++;
	    }
		return arr;
	}

}
