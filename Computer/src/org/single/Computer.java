package org.single;

public class Computer extends Desktop {

	private void Computermodel() {
		System.out.println("The computer model is : Windows");
	}

	public static void main(String[] args) {

		Computer com = new Computer();
		com.Computermodel();
		com.desktopSize();
	}
}