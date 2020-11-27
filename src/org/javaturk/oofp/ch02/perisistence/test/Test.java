
package org.javaturk.oofp.ch02.perisistence.test;

import org.javaturk.oofp.ch02.perisistence.dao.EmployeeDao;
import org.javaturk.oofp.ch02.perisistence.domain.Employee;
import org.javaturk.oofp.ch02.perisistence.service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDao();
		EmployeeService employeeService = new EmployeeService(employeeDao);
		
		Employee employee = new Employee(5555, "Mehmet", 8, "Production", "mmm");
		employeeService.createEmployee(employee);
		
		employeeService.changePassword(employee, "mmm55");
	}
}
