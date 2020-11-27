package org.javaturk.oofp.ch11.generics;

import java.util.HashMap;
import java.util.Map;

import org.javaturk.oofp.ch10.domain.Director;
import org.javaturk.oofp.ch10.domain.Employee;
import org.javaturk.oofp.ch10.domain.Manager;

public class GenericMap {

	public static void main(String[] args) {
		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, new Employee(1, "Betul", "Metin", 9));
		map.put(2, new Manager(2, "Hasan", "Huseyin", 17, "Production"));
		map.put(3, new Director(2, "Melahat", "Ozturk", 17, "Production", 2000));
		map.put(3, null);
		
//		map.put("ali", new Employee(1, "hhh"));

		Employee e1 = map.get(1);
		System.out.println(e1);
		
		Manager m1 = (Manager) map.get(2);
		System.out.println(m1);
	}
}
