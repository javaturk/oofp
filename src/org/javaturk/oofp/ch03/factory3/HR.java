package org.javaturk.oofp.ch03.factory3;

import java.util.Random;

public class HR {

	public Employee getAnEmployee() {
		Employee e = null;
		
		int i = (int) (5 * Math.random());
		int no = new Random().nextInt(1000);
		
		switch (i) {
		case 0:
			e = new Employee(no, "Ali", 4, "Production");
			break;
		case 1:
			e = new Secretary(no, "Sevim", 9, "Sales", new Manager(3, "Kamil", 17, "Sales", "Sales"));
			break;
		case 2:
			e = new Engineer(no, "Burhan", 5, "Production", "Improving production.");
			break;
		case 3:
			e = new Manager(no, "İsmail", 14, "Production", "Production");
			break;
		case 4:
			e = new Director(no, "Salih", 24, "Management", "Management", 4500);
			break;
		}
		return e;
	}
}
