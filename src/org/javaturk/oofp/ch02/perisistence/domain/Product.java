
package org.javaturk.oofp.ch02.perisistence.domain;

public class Product extends Entity {
	protected String sku;
	protected String description;
	protected double price;
	protected double tax;

	public Product(long id, String sku, String description, double price, double tax) {
		super(id);
		this.sku = sku;
		this.description = description;
		this.price = price;
		this.tax = tax;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
}
