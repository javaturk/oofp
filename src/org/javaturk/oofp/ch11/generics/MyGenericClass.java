package org.javaturk.oofp.ch11.generics;

import org.javaturk.oofp.ch10.domain.Employee;
import org.javaturk.oofp.ch10.domain.Manager;

public class MyGenericClass<T, V, S> {
	private T t;
	private V v;
	private S s;

	public MyGenericClass(T t, V v, S s) {
		this.t = t;
		this.v = v;
		this.s = s;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}

	public S getS() {
		return s;
	}

	public void setS(S s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "MyGenericClass [t=" + t + ", v=" + v + ", s=" + s + "]";
	}

	public static void main(String[] args) {
		
		Employee e = new Employee(1, "Nesrin", "Abali", 9);
		Manager m = new Manager(1, "Fatma", "Metin", 14, "Sales");
		MyGenericClass<Employee, Manager, Integer> mgc = new MyGenericClass(e, m, new Integer(8));

		Employee e1 = mgc.getT();
		Manager m1 = mgc.getV();
		int i = mgc.getS();
		System.out.println(mgc);

		String s = new String("Akin");
		Object o = new Object();
		MyGenericClass<String, Object, Boolean> mgc2 = new MyGenericClass(s, o, new Boolean(true));

		String s1 = mgc2.getT();
		Object o1 = mgc2.getV();
		boolean b = mgc2.getS();
		System.out.println(mgc2);
		

		MyGenericClass mgc3 = new MyGenericClass(new Integer(3), true, 7.12); // Doable but needs casts because the class does not know the types!
		int o3 = (int) mgc3.getT();
		Object o4 = mgc3.getV();
		Object o5 = mgc3.getS();
		System.out.println(mgc3);
		
	}
}
