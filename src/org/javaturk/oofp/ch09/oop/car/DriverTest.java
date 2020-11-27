package org.javaturk.oofp.ch09.oop.car;

public class DriverTest {

	public static void main(String[] args) {
		Car car1 = new Car("Mercedes", "C200", "2017", 0, 0);
		Driver akin = new Driver("Akin", car1);
		Place ayvalik = new Place("Ayvalık", 400);
		akin.drive(ayvalik);
		
		System.out.println();
		
		Car car2 = new Car("BMW", "i8", "2018", 10_000, 160);
		akin.setCar(car2);
		Place izmir = new Place("İzmir", 153);
		akin.drive(izmir);
	}
}
