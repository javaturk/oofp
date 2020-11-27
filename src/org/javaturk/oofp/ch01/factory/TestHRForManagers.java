package org.javaturk.oofp.ch01.factory;

public class TestHRForManagers {

	public static void main(String[] args) {
		HR hr = new HRForManagers();
		Employee e = hr.getAnEmployee();
		System.out.println(e);
		
		HRForManagers hrfm = new HRForManagers();
		Manager m = hrfm.getAnEmployee();
		System.out.println(m);
		
		
		
//		HR hr1 = new HRForManagers();
//		Manager m1 = hr1.getAnEmployee();
//		System.out.println(m1);
	}

}
