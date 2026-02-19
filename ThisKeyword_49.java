//WAP on This Keyword
//Assign value of local var to Global Var
package assignments;

public class ThisKeyword_49 {

	String empName;
	int empid;
	double empSalary;

	void empDetails(String empName, int empid, double empSalary) {
		this.empid = empid;
		this.empSalary = empSalary;
		this.empName = empName;
	}

	public static void main(String[] args) {
		ThisKeyword_49 t1 = new ThisKeyword_49();
		t1.empDetails("Shristi", 654, 99000.6);
		System.out.println(t1.empName);
		System.out.println(t1.empid);
		System.out.println(t1.empSalary);

	}

}
