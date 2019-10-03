
public class Employee {
	private int employeeID;
	private String employeeName;
	private int salary;

	public Employee(int i, String string, int j) {
		this.employeeID = i;
		this.employeeName = string;
		this.salary = j;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String showPaySlip(){
		return "$" + String.format("%.2f", Double.valueOf(salary/12));
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + employeeID + ", name=" + employeeName + ", salary=" + salary + "]";
	}
}
