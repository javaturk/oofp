package org.javaturk.oofp.ch02.factory;

public class HRForManagers extends HR {
	
	@Override
	public Manager getAnEmployee() {
		Manager m = null;
		int i = (int) (2 * Math.random());
		switch (i) {
		case 0:
			m = new Manager(1, "Ali the Manager", 12, "Production");
			break;
		case 1:
			m = new Director(6, "Salih the Director", 26, "Management", "Management", 5000);
			break;
		}

		return m;
	}
}
