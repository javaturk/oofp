package org.javaturk.oofp.ch10.commons;

import java.text.NumberFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

/**
 * https://commons.apache.org/proper/commons-collections/javadocs/api-4.4/org/apache/commons/collections4/Bag.html
 * https://commons.apache.org/proper/commons-collections/javadocs/api-4.4/org/apache/commons/collections4/bag/HashBag.html
 * @author akin
 *
 */
public class BagInventory {
	private Bag inventoryBag = new HashBag();
	
	private Album album1 = new Album("Ring Ring", "ABBA");
	private Album album2 = new Album("Love Me Do", "Beatles");
	private Album album3 = new Album("Appetite for Destruction", "Guns N' Roses");
	private Album album4 = new Album("Let It Bleed", "Rolling Stones");
	
	public static void main(String[] args) {
		BagInventory example = new BagInventory();
		example.start();
	}

	private void start() {
		// Read our inventory into a Bag
		populateInventory();
		System.out.println("Inventory before Transactions");
		printAlbums(inventoryBag);
		printSeparator();
		
		// A Customer wants to purchase 500 ABBA, 2 Radiohead, and 150 Parker
		Bag shoppingCart1 = new HashBag();
		shoppingCart1.add(album4, 500);
		shoppingCart1.add(album3, 150);
		shoppingCart1.add(album1, 2);
		checkout(shoppingCart1, "Customer 1");
		// Another Customer wants to purchase 600 copies of ABBA
		Bag shoppingCart2 = new HashBag();
		shoppingCart2.add(album4, 600);
		checkout(shoppingCart2, "Customer 2");
		// Another Customer wants to purchase 3 copies of Kraftwerk
		Bag shoppingCart3 = new HashBag();
		shoppingCart3.add(album2, 3);
		checkout(shoppingCart3, "Customer 3");
		System.out.println("Inventory after Transactions");
		printAlbums(inventoryBag);
	}

	private void populateInventory() {
		// Adds items to a Bag
		inventoryBag.add(album1, 200);
		inventoryBag.add(album2, 100);
		inventoryBag.add(album3, 500);
		inventoryBag.add(album4, 900);
	}

	private void printAlbums(Bag albumBag) {
		Set albums = albumBag.uniqueSet();
		Iterator albumIterator = albums.iterator();
		while (albumIterator.hasNext()) {
			Album album = (Album) albumIterator.next();
			NumberFormat format = NumberFormat.getInstance();
			format.setMinimumIntegerDigits(3);
			format.setMaximumFractionDigits(0);
			System.out.println("\t" + format.format(albumBag.getCount(album)) + " - " + album.getBand());
		}
	}

	private void checkout(Bag shoppingCart, String customer) {
		// Check to see if we have the inventory to cover this purchase
		if (inventoryBag.containsAll((Collection) shoppingCart)) {
			// Remove these items from our inventory
			inventoryBag.removeAll((Collection) shoppingCart);
			System.out.println(customer + " purchased the following items:");
			printAlbums(shoppingCart);
		}
		else {
			System.out.println(customer + ", I'm sorry " + "but we are unable to fill your order.");
		}
		printSeparator();
	}

	private void printSeparator() {
//		System.out.println(StringUtils.repeat("*", 65));
	}
}

class Album{
	private String name;
	private String band;
	
	public Album(String name, String artistName) {
		super();
		this.name = name;
		this.band = artistName;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	@Override
	public String toString() {
		return "Album [name=" + name + ", artistName=" + band + "]";
	}
}

