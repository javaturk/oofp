
package org.javaturk.oofp.ch03.factory1;

/**
 * @author akin
 *
 */
public class Test {

	public static void main(String[] args) {
		Worker w = new Employee(1, "Ali", 4, "Production");
		w.work();
//		w.calculateSalary(); // can't do that!
		
		if(w instanceof Employee) {
			Employee e = (Employee) w;
			System.out.println("Salary: " + e.calculateSalary());
		}
		
		if(w instanceof Employee e) {
			System.out.println("Salary: " + e.calculateSalary());
		}

		w = new Manager(5, "İsmail", 14, "Production", "Production");
		w.work();
		
		Manager m = (Manager) w;
		m.manage();

		Boss boss = new Boss();

		if (boss instanceof Worker) {
			System.out.println("true");
			Worker w1 = boss;
			w1.work();
		}
	}
}
