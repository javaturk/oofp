package org.javaturk.oofp.ch07.elevator;

import org.javaturk.oofp.ch07.elevator.domain.EncapsulatedElevator;
import org.javaturk.oofp.ch07.elevator.domain.Floor;

public class EncapsulatedElevatorTest {

	public static void main(String args[]) {

		EncapsulatedElevator encapElevator = new EncapsulatedElevator();

		encapElevator.openDoor(); // Get into the elevator
		encapElevator.goDown();
		encapElevator.goUp();
		encapElevator.goUp();
		encapElevator.closeDoor();
		encapElevator.openDoor(); // Somebody is coming :)
		encapElevator.goDown();
		encapElevator.goDown();
		encapElevator.goDown();
		encapElevator.go(Floor.FIFTH);
	}
}
