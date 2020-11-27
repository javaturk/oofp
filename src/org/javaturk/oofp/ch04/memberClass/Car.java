package org.javaturk.oofp.ch04.memberClass;

public class Car {

	private int speed;
	private int distance;
	private Make make;
	
	public Car(){
		
	}

	public Car(Make make, int speed, int distance) {
		this.make = make;
		this.speed = speed;
		this.distance = distance;
	}

	protected class Make {
		private String brand;
		private String model;
		private String year;

		public Make(String brand, String model, String year) {
			this.brand = brand;
			this.model = model;
			this.year = year;
		}

		public String getBrand() {
			return brand;
		}

		public String getModel() {
			return model;
		}

		public String getYear() {
			return year;
		}

		@Override
		public String toString() {
			return "Make [brand=" + brand + ", model=" + model + ", year=" + year + "]";
		}
	}

	public Make getMake() {
		return make;
	}
	
	public void setMake(Make make) {
		this.make = make;
	}

	public void go(int newDistance) {
		distance += newDistance;
	}

	public void accelerate(int newSpeed) {
		speed = newSpeed;
	}

	public void stop() {
		speed = 0;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", distance=" + distance + ", make=" + make + "]";
	}
}
