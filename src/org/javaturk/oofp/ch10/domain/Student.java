
package org.javaturk.oofp.ch10.domain;

public class Student implements Comparable {
	private int id;
	private String isim;

	public Student(int id, String isim) {
		this.id = id;
		this.isim = isim;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String toString() {
		return id + " " + isim;
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		if(id < s.id)
			return -1;
		else if(id == s.id)
			return 0;
		else 
			return 1;
	}
}