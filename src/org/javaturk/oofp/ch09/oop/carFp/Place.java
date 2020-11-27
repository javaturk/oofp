package org.javaturk.oofp.ch09.oop.carFp;

public class Place {
	private final String name;
	private final int distance;

	public Place(String name, int distance) {
		this.name = name;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "Place [name=" + name + ", distance=" + distance + "]";
	}
}
