/**
 * 
 */
package org.javaturk.oofp.ch03.erp;

/**
 * @author akin
 *
 */
public class ClothProduct extends Product {
	protected String sex;
	protected String size;

	/**
	 * @param sku
	 * @param description
	 * @param price
	 * @param tax
	 * @param location
	 * @param sex
	 * @param size
	 */
	public ClothProduct(String sku, String description, double price, double tax, Location location, String sex, String size) {
		super(sku, description, price, tax, location);
		this.sex = sex;
		this.size = size;
	}

	/**
	 * @author akin
	 * @see org.javaturk.oofp.ch04.erp.Product#purchase()
	 */
	@Override
	public void purchase() {
		System.out.println("ClothProduct " + description + "for " + sex + " and size " + size + " is purchased at the price of " + price + " with the tax of " + tax );
	}

}
