package org.network;

public class Wifi {

	private void wifiName() {
		System.out.println("wifi");
	}

	public static void main(String[] args) {
		Wifi wi = new Wifi();
		wi.wifiName();

		MobileData mo = new MobileData();
		mo.dataName();

		Lan la = new Lan();
		la.lanName();

		Wireless wi2 = new Wireless();
		wi2.modamName();
	}

}
