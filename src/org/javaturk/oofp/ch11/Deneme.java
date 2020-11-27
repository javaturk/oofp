package org.javaturk.oofp.ch11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Deneme {

	public static void main(String[] args) {
		List list = f(new ArrayList<>());
		list.forEach(System.out::println);
		Map.Entry m;
	}
	
	public static ArrayList f(ArrayList list) {
		list.add("Java");
		list.add(3);
		return list;
	}
}
