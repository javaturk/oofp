package org.javaturk.oofp.ch01;

public class SuperExample {

	public static void main(String[] args) {
		A a = new A();
		a.printI();
		a.f();
		
		B b = new B();
		b.printI();
		b.f();
	}

}

class A{
	int i = 7;
	
	public void printI(){
		System.out.println("i in A's object: " + i);
	}
	
	public void f(){
		System.out.println("f() in A");
	}
}

class B extends A{
	int i = 9;
	
	@Override
	public void printI(){
		System.out.println("i in B's object: " + i);
		System.out.println("i in A's object: " + super.i);
	}
	
	@Override
	public void f(){
		System.out.println("f() in B");
		super.f();
	}
}
