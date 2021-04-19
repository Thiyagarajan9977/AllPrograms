package org.scanner;

import java.util.Scanner;

public class Scan2 {
	
	public static void main(String[] args) {
		
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Enter the student ID :");
		int stdID = scan2.nextInt();
		System.out.println("The Student ID is : " +stdID);
		
		System.out.println("Enter the student name :");
		String stdName = scan2.next();
		System.out.println("The Student Name is : " +stdName);
		
		System.out.println("Enter the student Email :");
		String stdeMail = scan2.next();
		System.out.println("The Student Email is : " +stdeMail);
		
		System.out.println("Enter the student PhoneNo :");
		long stdPhone = scan2.nextLong();		
		System.out.println("The Student Phone no is : " +stdPhone);
		
		System.out.println("Enter the student Dept :");
		String Dept = scan2.nextLine();
		System.out.println("The Student Dept is : " +Dept);
		
		System.out.println("Enter the student Gender:");
		char Gender = scan2.next().charAt(0);
		System.out.println("The Student Gender is : " +Gender);
		
		System.out.println("Enter the student City:");
		String City = scan2.next();
		System.out.println("The Student city is : " +City);
				
	}

}
