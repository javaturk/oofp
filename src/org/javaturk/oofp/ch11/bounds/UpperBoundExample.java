package org.javaturk.oofp.ch11.bounds;

import java.util.*;

public class UpperBoundExample {

	public static void main(String[] args) {
		A a = new A();
		takeAutoClosable(a);

		B b = new B();
//		takeAutoClosable(b); // can't pass B object

		C c = new C(); 
		takeAutoClosable(c);
		
		List<AutoCloseable> list = new ArrayList<>();
		list.add(a);
//		list.add(b); // can't pass B object
		list.add(c);
		
		takeAutoClosableCollection(list);
	}

	public static <T extends AutoCloseable> void takeAutoClosable(T t) {
		System.out.println("\nCalling close() on " + t.getClass().getName());
		try {
			t.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void takeAutoClosableCollection(Collection<? extends AutoCloseable> coll) {
		System.out.println("\nProcessing " + coll.getClass().getName());
		coll.forEach((i) -> {
			System.out.println("\nCalling close() on " + i.getClass().getName());
			try {
				i.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}

class A implements AutoCloseable {

	public void f() throws Exception {
		System.out.println("in f() of A.");
	}

	@Override
	public void close() throws Exception {
		System.out.println("A object has been closed.");
	}
}

class B {

	public void g() throws Exception {
		System.out.println("in g() of B");
	}
}

class C extends A {

	@Override
	public void f() throws Exception {
		System.out.println("in f() of C.");
	}
}
