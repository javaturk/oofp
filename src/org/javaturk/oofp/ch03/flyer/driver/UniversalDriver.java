package org.javaturk.oofp.ch03.flyer.driver;

import org.javaturk.oofp.ch03.flyer.vehicle.Vehicle;


public class UniversalDriver extends AbstractDriver{
	
	public UniversalDriver(String name) {
		super(name);
	}

	@Override
	public void drive(Vehicle vehicle) {
		park(vehicle);		
	}
	
	public void park(Vehicle vehicle) {
		System.out.println("\n" + name + " is parking " + vehicle);
		vehicle.turnOn();
		vehicle.go();
		vehicle.stop();
		vehicle.turnOff();		
	}
}
