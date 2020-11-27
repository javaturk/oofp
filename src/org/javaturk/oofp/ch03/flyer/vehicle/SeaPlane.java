package org.javaturk.oofp.ch03.flyer.vehicle;


public class SeaPlane extends Airplane implements Floatable{

	public SeaPlane(String name) {
		super(name);
	}

	public void turnOn() {
		System.out.println("SeaPlane has been turned on.");
	}

	public void stop() {
		System.out.println("SeaPlane has stopped.");
	}

	public void go() {
		System.out.println("SeaPlane is going.");
	}

	public void turnOff() {
		System.out.println("SeaPlane has been turned off.");
	}

	@Override
	public void takeOff() {
		System.out.println("SeaPlane is taking off.");
	}

	@Override
	public void fly() {
		System.out.println("SeaPlane is flying.");
	}

	@Override
	public void land() {
		System.out.println("SeaPlane is landing.");
	}
	
	@Override
	public void floatNow() {
		System.out.println("SeaPlane is floatig now.");		
	}
	

	@Override
	public void park() {
		System.out.println("SeaPlane has been parked.");
	}
	

	@Override
	public String toString() {
		return "SeaPlane [name=" + name + "]";
	}

}
