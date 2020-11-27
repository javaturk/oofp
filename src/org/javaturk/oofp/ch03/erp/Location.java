/**
 * 
 */
package org.javaturk.oofp.ch03.erp;

public class Location {
	private String depot = "FirstDepot Building.";
	private String place = "Bla bla place.";

	public Location(String depot, String place) {
		this.depot = depot;
		this.place = place;
	}

	/**
	 * @return the depot
	 */
	public String getDepot() {
		return depot;
	}

	/**
	 * @param depot
	 *            the depot to set
	 */
	public void setDepot(String depot) {
		this.depot = depot;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place
	 *            the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}
}
