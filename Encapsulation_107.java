//WAP on Encapsulation
package assignments;

//Encapsulated class
class Emp {

	// Private data members
	private int empId;
	private String empName;
	private double salary;

	// Public getter and setter methods
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

//Main class
public class Encapsulation_107 {

	public static void main(String[] args) {

		Emp emp = new Emp();

		// Setting values using setter methods
		emp.setEmpId(101);
		emp.setEmpName("Shristi");
		emp.setSalary(50000);

		// Getting values using getter methods
		System.out.println("Employee ID: " + emp.getEmpId());
		System.out.println("Employee Name: " + emp.getEmpName());
		System.out.println("Salary: " + emp.getSalary());
	}
}
