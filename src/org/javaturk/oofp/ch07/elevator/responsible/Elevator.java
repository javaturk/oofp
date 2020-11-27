package org.javaturk.oofp.ch07.elevator.responsible;

public interface Elevator {
	
	public void go(Floor desiredFloor);
	
	public void openDoor();
	
	public void closeDoor();

}
