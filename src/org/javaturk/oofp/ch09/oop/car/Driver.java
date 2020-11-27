package org.javaturk.oofp.ch09.oop.car;

public class Driver {
	private String name;
	private Car car;
	
	public Driver(String name, Car car) {
		this.name = name;
		this.car = car;
	}
	
	public void drive(Place place) {
		System.out.println("Driving to " + place);
		int distance = place.getDistance();
		car.accelerate(120);
		car.go(distance);
		car.stop();
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", car=" + car + "]";
	}
}
