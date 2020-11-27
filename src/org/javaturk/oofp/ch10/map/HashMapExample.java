/*
 * HashMapExample.java
 */

package org.javaturk.oofp.ch10.map;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
	private static Map map = new HashMap();

	public static void main(String[] args) {

		String[][] capitals = Capitals.capitals;
		for (int i = 0; i < capitals.length; i++) {
			String[] pair = capitals[i];
			String country = pair[0];
			String capital = pair[1];
			map.put(country, capital);
		}

		if (args.length == 0)
			 listCountriesAndCapitals();
			// listCountriesAndCapitalsAsEntrySet();
//			listCapitals();
		else {
			if (args[0].length() == 1)
				listCapitalsForCountriesStartingWithALetter(args[0]);
			else
				getCapital(args[0]);
		}
	}

	public static void listCapitalsForCountriesStartingWithALetter(String letter) {
		System.out.println("List of capitals for countries with a given letter: " + letter);
		String upperCaseLetter = letter.toUpperCase();
		
		Set keySet = map.keySet();
		Iterator iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String country = (String) iterator.next();
			if (country.startsWith(upperCaseLetter))
				System.out.println(country + ": " + map.get(country));
		}
	}

	public static void getCapital(String country) {
		System.out.println("Capital for " + country);
		String searchKey = country.toUpperCase();
		String capitalForKey = (String) map.get(searchKey);
		if (capitalForKey == null)
			System.out.println("No capital for the country found!");
		else
			System.out.println("Capital of " + searchKey + " is " + capitalForKey);
	}

	public static void listCountriesAndCapitals() {
		System.out.println("List of countries and capitals.");
		Set keySet = map.keySet();
		Iterator iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String country = (String) iterator.next();
			String capital = (String) map.get(country);
			System.out.println(country + "-" + capital);
		}
	}

	public static void listCountriesAndCapitalsAsEntrySet() {
		System.out.println("List of countries and capitals as entry set.");
		Set entrySet = map.entrySet();
		Iterator iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry mapEntry = (Entry) iterator.next();
			String country = (String) mapEntry.getKey();
			String capital = (String) mapEntry.getValue();
			System.out.println(country + "-" + capital);
		}
	}

	public static void listCapitals() {
		System.out.println("List of capitals.");
		Collection capitals = map.values();
		Iterator iterator = capitals.iterator();
		while (iterator.hasNext()) {
			String country = (String) iterator.next();
			System.out.println(country);
		}
	}
}
