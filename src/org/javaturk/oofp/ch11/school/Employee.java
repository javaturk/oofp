package org.javaturk.oofp.ch11.school;

public class Employee {

	protected int no;
	protected String name;

	public Employee(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public void work(){
		System.out.println("EMployee is working.");
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + no;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (no != other.no)
			return false;
		return true;
	}
}
