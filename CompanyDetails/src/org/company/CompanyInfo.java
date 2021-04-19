package org.company;

public class CompanyInfo extends Client{
	
	private void companyName() {
		System.out.println("The company name is : My Company ");
	}

	private void companyId() {
		System.out.println("The company Id is : 123456");
		}
	
	private void companyAddress() {
		System.out.println("The company Address is : Chennai - Tambaram");
		
	}

	public static void main(String[] args) {
		CompanyInfo comp = new CompanyInfo();
		comp.companyAddress();
		comp.companyId();
		comp.companyName();
		comp.clientname();
		
		
	}
	
}

