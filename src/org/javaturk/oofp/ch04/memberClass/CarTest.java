package org.javaturk.oofp.ch04.memberClass;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car.Make make1 = car1.new Make("Mercedes", "C180", "2017");
		car1.setMake(make1);
		
		System.out.println(car1);
		
		System.out.println();

		Car car2 = new Car();
		Car.Make make2= car2.new Make("BMW", "i8", "2017");
		car2.setMake(make2);
		car2.accelerate(120);
		car2.go(100);
		car2.go(50);
		System.out.println(car2);
		
		System.out.println();
		
		Car.Make carMake = car2.getMake();
		System.out.println(carMake);
	}
}
