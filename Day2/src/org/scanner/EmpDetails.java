package org.scanner;

import java.util.Scanner;

public class EmpDetails {

	public static void main(String[] args) {

		Scanner emp = new Scanner(System.in);

		System.out.println("Enter the emp ID");
		int empid = emp.nextInt();
		System.out.println("Enter the emp ID : " + empid);

		System.out.println("Enter the emp Name : ");
		String empName = emp.next();
		System.out.println("Enter the emp name : " + empName);

		System.out.println("Enter the email :");
		String email = emp.next();
		System.out.println("Enter the email :" + email);

		System.out.println("Enter the phone :");
		long phone = emp.nextLong();
		System.out.println("Enter the phone : " + phone);

		System.out.println("Enter the emp Salary : ");
		float Salary = emp.nextFloat();
		System.out.println("Enter the emp Salary : " + Salary);

		System.out.println("Enter the emp Gender : ");
		char Gender = emp.next().charAt(1);
		System.out.println("Enter the emp Gender :" + Gender);

		System.out.println("Enter the emp empcity : ");
		String empcity = emp.next();
		System.out.println("Enter the empcity : " + empcity);

	}

}
