package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {

	private void TransportForm() {
		System.out.println("TransportForm");

	}

	public static void main(String[] args) {
		Transport tr = new Transport();
		tr.TransportForm();

		Road ro = new Road();
		ro.bike();
		ro.bus();
		ro.car();
		ro.cycle();
		ro.cycle();

		Air ai = new Air();
		ai.aeroPlane();
		ai.heliCopter();

		Water wa = new Water();
		wa.boat();
		wa.ship();

	}

}
