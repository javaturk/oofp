package org.javaturk.oofp.ch01.factory.problem.problem2;


public class TestPayrollOffice {

	public static void main(String[] args) {
		PayrollOffice payrollOffice = new PayrollOffice();
		
		Employee employee = new Employee(1, "Ali", 8, "Production");
		payrollOffice.paySalary(employee);

		Employee manager = new Employee(2, "Fatma", 3, "Production", "Production");
		payrollOffice.paySalary(manager);

		Employee director = new Employee(3, "Mehmet", 20, "Management", "Management", 3000);
		payrollOffice.paySalary(director);
	}
}
