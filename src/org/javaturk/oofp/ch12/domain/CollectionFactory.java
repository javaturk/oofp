package org.javaturk.oofp.ch12.domain;

import java.util.*;

public class CollectionFactory {
	private static Random random = new Random();
	
	private static List<String> nameList = Arrays.asList("Kemal", "Selim", "Cemalettin", "Ebru", "Zeynep",
			"Harun", "Menekse", "Ahmet", "Mahmut", "Nazlı", "Selim", "Cemalettin", "Abdullah");
	
	private static List<String> duplicatedNameList = Arrays.asList("Zeynep", "Kemal", "Selim", "Cemalettin", "Ebru", "Zeynep",
			"Harun", "Ebru", "Menekse", "Ahmet", "Ahmet", "Kemal");
	
	private static Set<String> nameSet;
	
	private static int[] intArray = {32, 57, 21, 84, 19, 69, 30, 8, 85, 47};
	private static long[] longArray = {323_284_289_283L, 4L, 21L, 327_942_428_184L, 199L, 261_283L, 300_000L, 888_888, 302L, 741};
	private static double[] doubleArray = {45.92, 75.71, 12.03, 94.00, 19.37, 3.1415, 2.71828, 14.44, 68.73, 59.08};
	
	private static String[] stringIntArray = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35",
			"36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"};
	
	static {
		nameSet = new HashSet<>();
		nameSet.add("Kemal");
		nameSet.add("Selim");
		nameSet.add("Cemalettin");
		nameSet.add("Ebru");
		nameSet.add("Zeynep");
		nameSet.add("Harun");
		nameSet.add("Menekse");
		nameSet.add("Ahmet");
		nameSet.add("Mahmut");
		nameSet.add("Ebru");
		nameSet.add("Ali");
	}
	
	public static List<String> getNameList() {
		return nameList;
	}
	
	public static List<String> getEmptyNameList() {
		return new ArrayList<String>();
	}
	
	public static List<String> getDuplicatedNameList() {
		return duplicatedNameList;
	}
	
	public static Set<String> getNameSet() {
		return nameSet;
	}
	
	public static int[] getIntArray() {
		return intArray;
	}
	
	public static double[] getDoubleArray() {
		return doubleArray;
	}

	public static long[] getLongArray() {
		return longArray;
	}
	
	public static String[] getStringIntArray() {
		return stringIntArray;
	}
	
	public static String[] getStringArrayBySize(int size) {
		String[] strings = new String[size];
		for(int i = 0; i < size; i++) {
			int r = random.nextInt();
			strings[i] = Integer.toString(r);
		}
		return strings;
	}
}
