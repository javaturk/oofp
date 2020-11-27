
package org.javaturk.oofp.ch10.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.javaturk.oofp.ch10.domain.Employee;
import org.javaturk.oofp.ch10.domain.EmployeeComparator;
import org.javaturk.oofp.ch10.util.CollectionUtil;

/**
 * @author akin
 *
 */
public class SetWithDuplicatedObjects {

	public static void main(String[] args) {
//		EmployeeComparator ec = new EmployeeComparator();
		Set set = new TreeSet();

		Employee e1 = new Employee(888, "Mihrimah", "Kaldiroglu");
		System.out.println(set.add(e1));
		
		Employee e2 = new Employee(222, "Ali", "Can");
		System.out.println(set.add(e2));
		
		Employee e3 = new Employee(111, "Ayse", "Unlu");
		System.out.println(set.add(e3));
		
		Employee e4 = new Employee(223, "Sami", "Mutlu");
		System.out.println(set.add(e4));
		
		Employee e5 = new Employee(222, "Ali", "Can");
		System.out.println(set.add(e5));  // Do you think e5 would be added?

		CollectionUtil.listElements(set);
	}
}
