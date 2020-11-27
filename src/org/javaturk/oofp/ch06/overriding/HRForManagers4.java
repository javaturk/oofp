package org.javaturk.oofp.ch06.overriding;

import org.javaturk.oofp.ch02.factory.Director;
import org.javaturk.oofp.ch02.factory.Manager;

public class HRForManagers4 extends HR {
	
//	@Override
//	public Manager getAnEmployee(int no) throws Exception{ // Can't do this!
//		Manager m = null;
//		switch (no) {
//		case 0:
//			m = new Manager(1, "Ali the Manager", 12, "Production");
//			break;
//		case 1:
//			m = new Director(6, "Salih the Director", 26, "Management", "Management", 5000);
//			break;
//		default:
//			throw new Exception("no: " + no);
//		}
//
//		return m;
//	}
}
