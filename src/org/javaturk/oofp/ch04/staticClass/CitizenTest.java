package org.javaturk.oofp.ch04.staticClass;

public class CitizenTest {

	public static void main(String[] args) {
		Citizen.Nationality nationality1 = new Citizen.Nationality("Turkey", "TC");
		
		Citizen citizen1 = new Citizen(nationality1, "12345678901", "Selim", "Aktas");
		System.out.println(citizen1);
		
		System.out.println();

		Citizen citizen2 = new Citizen(nationality1, "98765432101", "Zeynep", "Tasci");
		System.out.println(citizen2);
		
		System.out.println();
		
		Citizen.Nationality nationality2 = new Citizen.Nationality("United States", "US");
		Citizen citizen3 = new Citizen(nationality2, "4324233453", "John", "Teller");
		System.out.println(citizen3);
		
		System.out.println();
		System.out.println(citizen1);
		System.out.println(citizen2);
		System.out.println(citizen3);
	}
}
