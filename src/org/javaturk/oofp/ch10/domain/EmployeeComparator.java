
package org.javaturk.oofp.ch10.domain;

import java.util.Comparator;

public class EmployeeComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee e1 = (Employee) arg0;
		Employee e2 = (Employee) arg1;

		if (e1.getNo() < e2.getNo())
			return -1;
		else if (e1.getNo() == e2.getNo())
			return 0;
		else
			return 1;
	}
	
//	@Override
//	public int compare(Object arg0, Object arg1) {
//		Employee e1 = (Employee) arg0;
//		Employee e2 = (Employee) arg1;
//
//		return  e1.getYear() - e2.getYear();
//	}
}