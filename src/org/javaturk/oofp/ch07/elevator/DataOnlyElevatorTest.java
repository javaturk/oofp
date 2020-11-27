package org.javaturk.oofp.ch07.elevator;

import org.javaturk.oofp.ch07.elevator.domain.DataOnlyElevator;

public class DataOnlyElevatorTest {
	
	private static DataOnlyElevator publicElevator = new DataOnlyElevator();
	static boolean stopped = false;

	public static void main(String args[]) {
		
		printElevatorState();
		publicElevator.doorOpen = true; // passengers get on
		
		publicElevator.doorOpen = false; // doors closed
		printElevatorState();
		// go down to currentFloor 0 (below bottom of building)
		publicElevator.currentFloor--;
		publicElevator.currentFloor++;

		// jump to currentFloor 7 (only 5 floors in building)
		publicElevator.currentFloor = 7567;
		publicElevator.doorOpen = true; // passengers get on/off
		
		printElevatorState();
		publicElevator.doorOpen = false;
		
		publicElevator.currentFloor = -15; // go to the first floor
		printElevatorState();
		publicElevator.doorOpen = true; // passengers get on/off
		publicElevator.currentFloor++; // elevator moves with door open
		printElevatorState();
		publicElevator.doorOpen = false;
		publicElevator.currentFloor--;
		publicElevator.currentFloor--;
		printElevatorState();
		publicElevator.currentFloor--;
		printElevatorState();
	}
	
	public static void printElevatorState(){
		String doorStatusString = "CLOSED";
		if(publicElevator.doorOpen)
			doorStatusString = "OPEN";
		
		System.out.println("Elevator is at floot " + publicElevator.currentFloor + " and the door is " + doorStatusString);
	}
}
