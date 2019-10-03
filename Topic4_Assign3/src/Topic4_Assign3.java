
public class Topic4_Assign3 {

	public static void main(String[] args) {
		// create the database
		EmployeeDB employeeDB = new EmployeeDB();

		// add employees
		Employee e1 = new Employee(12, "Bob", 42000);
		Employee e2 = new Employee(13, "Jenny", 44000);
		Employee e3 = new Employee(14, "Imran", 64000);
		Employee e4 = new Employee(15, "Areeba", 54000);
		Employee e5 = new Employee(16, "Tariq", 65000);
		
		employeeDB.addEmployee(e1);
		employeeDB.addEmployee(e2);
		employeeDB.addEmployee(e3);
		employeeDB.addEmployee(e4);
		employeeDB.addEmployee(e5);
		
		for(Employee e: employeeDB.listAll()){
			System.out.println(e.toString());
		}
		
		System.out.println("\nDeleting Bob...");
		
		employeeDB.deleteEmployee(12);
		
		for(Employee e: employeeDB.listAll()){
			System.out.println(e.toString());
		}
		
		System.out.println("\nShowing Tariq's Monthly Payslip");
		int empIDSearch=16;
		System.out.println(employeeDB.showPaySlip(empIDSearch));
		
	}

}
