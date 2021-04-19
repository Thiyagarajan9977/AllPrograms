package org.phone;

public class InternalStorage {
	
	private void processorName() {
		System.out.println("he processor name is Intel");
	}
	
	private void ramSize() {
		System.out.println("The ram size is 32GB");
	}
	
	public static void main(String[] args) {
		
		ExternalStorage ext = new ExternalStorage();
		ext.size();

		InternalStorage In = new InternalStorage();
		In.processorName();
		In.ramSize();
		
	} 
	

}
