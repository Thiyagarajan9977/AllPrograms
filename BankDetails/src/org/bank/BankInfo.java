package org.bank;

public class BankInfo extends AxisBank {

	private void saving() {
		System.out.println("Saving");
	}

	private void fixed() {
		System.out.println("fixed");
	}

	public static void main(String[] args) {
		BankInfo Ba = new BankInfo();
			Ba.Deposit();
			Ba.saving();
			Ba.fixed();
		
	}
}
