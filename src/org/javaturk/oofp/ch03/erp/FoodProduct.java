/**
 * 
 */
package org.javaturk.oofp.ch03.erp;

import java.util.Date;

public class FoodProduct extends Product {
	protected Date productionDate;
	protected int life;

	/**
	 * @param sku
	 * @param description
	 * @param price
	 * @param tax
	 * @param location
	 * @param productionDate
	 * @param life
	 */
	public FoodProduct(String sku, String description, double price, double tax, Location location, Date productionDate, int life) {
		super(sku, description, price, tax, location);
		this.productionDate = productionDate;
		this.life = life;
	}

	/**
	 * @author akin
	 * @see org.javaturk.oofp.ch04.erp.Product#purchase()
	 */
	@Override
	public void purchase() {
		System.out.println("FoodPorudct " + description + " is purchased at the price of " + price + " with the tax of " + tax );
	}

}
