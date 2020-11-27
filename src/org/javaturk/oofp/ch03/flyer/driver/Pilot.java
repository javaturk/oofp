package org.javaturk.oofp.ch03.flyer.driver;

import org.javaturk.oofp.ch03.flyer.vehicle.Airplane;
import org.javaturk.oofp.ch03.flyer.vehicle.Vehicle;

public class Pilot extends AbstractDriver{
	
	public Pilot(String name) {
		super(name);
	}

	@Override
	public void drive(Vehicle vehicle){
		vehicle.turnOn();
		fly(vehicle);
	}
	
	private void fly(Vehicle vehicle){
		if(vehicle instanceof Airplane){
			Airplane plane = (Airplane) vehicle;
			System.out.println("\nFlying an Airplane: " + plane);
			plane.turnOn();
			plane.takeOff();
			plane.fly();
			plane.land();
			plane.turnOff();
		}
		else{
			vehicle.turnOn();
			vehicle.go();
			vehicle.stop();
			vehicle.turnOff();
		}
	}
}
