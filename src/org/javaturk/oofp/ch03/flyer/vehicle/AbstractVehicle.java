package org.javaturk.oofp.ch03.flyer.vehicle;

public abstract class AbstractVehicle implements Vehicle{
	protected String name;
	
	public AbstractVehicle(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
}
