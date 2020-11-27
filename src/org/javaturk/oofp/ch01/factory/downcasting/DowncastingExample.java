package org.javaturk.oofp.ch01.factory.downcasting;

import org.javaturk.oofp.ch01.factory.*;

public class DowncastingExample {

	public static void main(String[] args) {
		// Upcasting
		Employee e1 = new Employee(5, "İsmail", 14, "Production");
		e1 = new Manager(5, "İsmail", 14, "Production", "Production");

		Employee e2 = new Employee(1, "Ali", 4, "Production");
		// Downcasting
//		Manager m2 = (Manager) e2; // ClassCastException!
//		m2.manage();

//		Director d1 = (Director) new Manager(5, "İsmail", 14, "Production", "Production"); // ClassCastException!
//		Director d2 = (Director) new Employee(1, "Ali", 4, "Production"); // ClassCastException!

		HR hr = new HR();
		Employee e = hr.getAnEmployee();
//		e.makeAStrategicPlan();

		if (e instanceof Director) {
			Director d3 = (Director) e;
			d3.makeAStrategicPlan();
		} else if (e instanceof Manager) {
			Manager m = (Manager) e;
			m.manage();
		} else if (e instanceof Secretary) {
			Secretary s = (Secretary) e;
			s.serve();
		}else
			e.work();

	}
}
