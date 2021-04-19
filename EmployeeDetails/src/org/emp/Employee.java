package org.emp;

public class Employee {
	
	private void empID() {
		System.out.println("empID");
	}
	
	private void empName() {
System.out.println("empName");
	}
	
	private void empDOB() {
System.out.println(" EMPDOB");
	}

	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empDOB();
		emp.empID();
		emp.empName();
	}
}
