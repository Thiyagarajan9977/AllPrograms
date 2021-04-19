package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	
	private void empName() {
		System.out.println("The emp name is Thiyagu");
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empName();
		
		Company comp = new Company();
		comp.companyName();
		
		Client cl= new Client();
		cl.clientName();
		
		Project pr = new Project();
		pr.projectName();
		
	}
	
}
