package org.javaturk.oofp.ch03.flyer.vehicle;

public class Airplane extends AbstractVehicle implements Flyer {

	public Airplane(String name) {
		super(name);
	}

	public void turnOn() {
		System.out.println("Airplane has turned on.");
	}

	public void stop() {
		System.out.println("Airplane has stopped.");
	}

	public void go() {
		System.out.println("Airplane is going.");
	}

	public void turnOff() {
		System.out.println("Airplane has turned off.");
	}

	@Override
	public void takeOff() {
		System.out.println("Airplane is taking off.");
	}

	@Override
	public void fly() {
		System.out.println("Airplane is flying.");
	}

	@Override
	public void land() {
		System.out.println("Bird is landing.");
	}
	
	@Override
	public String toString() {
		return "Airplane [name=" + name + "]";
	}

}
