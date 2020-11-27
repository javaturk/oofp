package org.javaturk.oofp.ch09.oop.carFp;

/**
 * Bu basit bir araba sınıfı örneğidir.
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class Car{

	private final String make;
	private final String model;
	private final String year;
	private int speed;
	private int distance;
	
	public Car(String make, String model, String year, int speed, int distance) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.speed = speed;
		this.distance = distance;
	}

	public void go(int newDistance) {
		distance += newDistance;
	}

	public void accelerate(int speed) {
		System.out.println("Speeding up to " + speed);
		this.speed = speed;
	}

	public void stop() {
		System.out.println("Stopping.");
		speed = 0;
	}

	public String getInfo() {
		return "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
	}
}
