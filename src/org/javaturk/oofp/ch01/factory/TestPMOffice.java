package org.javaturk.oofp.ch01.factory;

public class TestPMOffice {

	public static void main(String[] args) {
		PMOffice pmOffice = new PMOffice();
		
		Manager m1 = new Manager(2, "Fatma", 3, "Production", "Production");
		pmOffice.manageProject("ProjectX", m1);
		
		Director d1 = new Director(3, "Mehmet", 20, "Management", "Management", 3000);
		pmOffice.manageProject("ProjectY", d1);
		
		Employee e1 = new Employee(1, "Ali", 8, "Production");
		
		// Can't do this!
//		pmOffice.manageProject("ProjectY", e1);
	}
}
