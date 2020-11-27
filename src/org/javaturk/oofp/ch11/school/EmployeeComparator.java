package org.javaturk.oofp.ch11.school;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		int result = 0;

		if (e1.no < e2.no)
			result = -1;
		else if (e1.no > e2.no)
			result = 1;

		return result;
	}
}
