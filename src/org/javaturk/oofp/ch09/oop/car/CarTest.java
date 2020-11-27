package org.javaturk.oofp.ch09.oop.car;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car("Mercedes", "C200", "2017", 0, 0);
		car1.accelerate(125);
		car1.go(100);
		car1.go(50);
		System.out.println(car1.getInfo());

		System.out.println();

		Car car2 = new Car("BMW", "i8", "2018", 10_000, 160);
		car2.accelerate(220);
		car2.go(150);
		System.out.println(car2.getInfo());
	}
}
