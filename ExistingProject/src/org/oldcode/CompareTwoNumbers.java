package org.oldcode;

import java.util.Scanner;

public class CompareTwoNumbers {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st Number :");
		int a = input.nextInt();
		
		System.out.println("Enter the 2nd Number :");
		int b = input.nextInt();
		
		if(a==b)
			System.out.printf("%d==%d \n", a, b );
		
		if(a!=b)
			System.out.printf("%d !=%d \n", a, b );
		
		if(a<b)
			System.out.printf("%d <%d \n", a, b );
		
		if(a>b)
			System.out.printf("%d >%d \n", a, b );
		
		if(a<=b)
			System.out.printf("%d <=%d \n", a, b );
		
		if(a>=b)
			System.out.printf("%d >=%d \n", a, b );
		
	}

}
