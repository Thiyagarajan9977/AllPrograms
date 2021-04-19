package org.phone;

public class PhoneInfo {
	
	
	private void phoneName() {
		System.out.println("The phone name is : OPPO ");
	}

	private void phoneMieiNum() {
		System.out.println("The phone IMEI num is : 1234567890");
		}
	
	private void Camera() {
		System.out.println("The phone Camera is : 12MP");
		
	}
	private void storage() {
		System.out.println("The phone storage is : 64GB");
		
	}
	private void osName() {
		System.out.println("The phone OS is : Android");
		
	}
	
	public static void main(String[] args) {
		PhoneInfo phone = new PhoneInfo();
		phone.phoneName();
		phone.phoneMieiNum();
		phone.osName();
		phone.storage();
		phone.Camera();
	}
}
