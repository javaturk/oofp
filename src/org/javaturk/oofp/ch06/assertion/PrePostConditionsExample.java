/**
 * 
 */
package org.javaturk.oofp.ch06.assertion;

public class PrePostConditionsExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		assert car.checkStopped(); 	// Pre-condition check
		car.accelerate(100);
		assert !car.checkStopped();	// Post-condition check
		
		car.stop();
		assert car.checkStopped();  // Post-condition check
	}
}

class Car {
	boolean started;
	int speed;

	public void accelerate(int speed) {
		this.speed = speed;
		started = true;
	}

	public void stop() {
		speed = 0;
		started = false;
	}

	public boolean checkStopped() {
		if (speed > 0 | started) // Change it to "!started" to see the assertion error.
			return false;
		else
			return true;
	}
}
