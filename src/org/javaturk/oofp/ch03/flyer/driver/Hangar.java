package org.javaturk.oofp.ch03.flyer.driver;

import org.javaturk.oofp.ch03.flyer.vehicle.Airplane;

public class Hangar {
	protected String name;

	public Hangar(String name) {
		this.name = name;
	}

	public void store(Airplane plane) {
		System.out.println("\nStoring the airplane: " + plane + " in " + name + " hangar.");
		plane.go();
		plane.takeOff();
		plane.land();
	}

	@Override
	public String toString() {
		return "Hangar [name=" + name + "]";
	}
}
