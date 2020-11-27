package org.javaturk.oofp.ch03.flyer.vehicle;


public class Boat extends AbstractVehicle implements Floatable{
	
	public Boat(String name) {
		super(name);
	}

	public void turnOn() {
		System.out.println("Boat has turned on.");
	}

	public void stop() {
		System.out.println("Boat has stopped.");
	}

	public void go() {
		System.out.println("Boat is going.");
	}

	public void turnOff() {
		System.out.println("Boat has turned off.");
	}

	@Override
	public void floatNow() {
		System.out.println("Boat is floating now.");
	}
	
	@Override
	public void park() {
		System.out.println("Boat has parked.");
	}
	
	@Override
	public String toString() {
		return "Boat [name=" + name + "]";
	}
}
