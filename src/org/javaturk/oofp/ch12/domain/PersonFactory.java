package org.javaturk.oofp.ch12.domain;

import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class PersonFactory {

	private static Random random = new Random();

	private static String[] firstnames = { "Ali", "Ayse", "Bahar", "Cem", "Demet", "Eylem", "Faruk", "Fatma", "Ganime",
			"Haydar", "Halil", "Ismail", "Jale", "Kemal", "Leman", "Mustafa", "Nedim", "Nilufer", "Selim", "Selman",
			"Sevda", "Tarik", "Teoman", "Yeliz", "Zuhal" };
	private static String[] lastnames = { "Arabaci", "Aslan", "Batur", "Bulut", "Ceviz", "Karli", "Lale", "Ozturk",
			"Pasa", "Sari", "Serim", "Telli", "Torbaci", "Yazar", "Zafer" };

	public static Person createPerson() {
		Person person = new Person();
		person.setId(createId());
		person.setFirstName(createFirstName());
		person.setLastName(createLastName());
		person.setDob(createDob());
		return person;
	}
	
	public static List<Person> generatePersonList (int size) {
		List<Person> list = new ArrayList<>();
		for (int i=0; i<size; i++) {
			list.add(createPerson());
		}
		return list;
	}

	private static int createId() {
		int randomInt = random.nextInt();
		if (randomInt < 0)
			randomInt = -randomInt;
		return randomInt;
	}

	private static String createFirstName() {
		int randomInt = random.nextInt(25);
		return firstnames[randomInt];
	}

	private static String createLastName() {
		int randomInt = random.nextInt(15);
		return lastnames[randomInt];
	}

	private static Date createDob() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(1950 + random.nextInt(60), random.nextInt(11), random.nextInt(30));
		return calendar.getTime();
	}
}

