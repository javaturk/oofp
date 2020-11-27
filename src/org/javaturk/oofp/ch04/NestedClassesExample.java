package org.javaturk.oofp.ch04;

//import org.javaturk.oofp.ch04.TopCass.InnerClass;

public class NestedClassesExample {

	public static void main(String[] args) {

		TopCass.doThat(5);

		TopCass tc = new TopCass();
		tc.doIt(10);
		
		TopCass.InnerClass o1 = tc.getIc();
		o1.show();
		
		TopCass.StaticInnerClass o2 = TopCass.getSic();
		o2.show();
	}
}

class TopCass {
	private int i = 5;
	private static int j = 8;

	private InnerClass ic = new InnerClass(19);
	private static StaticInnerClass sic = new StaticInnerClass();

	static class StaticInnerClass {
		public StaticInnerClass() {
			System.out.println("\nin StaticInnerClass() and j: " + j);
//			System.out.println("i: " + i); // Can't make static reference to a non-static field
//			System.out.println("o.l: " + o.l); // Can't make static reference to a non-static field
		}
		
		public void show() {
			System.out.println("in show() of StaticInnerClass");
		}
	}
	
	class InnerClass {
		private int l;
		public InnerClass(int l) {
			this.l = l;
			System.out.println("\nin InnerClass() and i: " + i + " and j: " + j);
		}
		
		public void show() {
			System.out.println("in show() of InnerClass");
		}
	}

	public TopCass() {
		System.out.println("in TopCass()");
	}
	
	public InnerClass getIc(){
		return ic;
	}
	
	public static StaticInnerClass getSic(){
		return sic;
	}

	public void doIt(int k) {
//		k++;

		class LocalClass1 {

			public LocalClass1() {
				System.out.println("\nin LocalClass1()");
			}

			public void doLocal() {
				System.out.println("in doLocal() and j: " + j + " and i: " + i + " and k: " + k);
			}
		}

		LocalClass1 o = new LocalClass1();
		o.doLocal();
		
		int m = 10;
//		m++;

		new MyInterface() {

			{
				System.out.println("\nAn instance initializer instead of a constructor.");
			}

			@Override
			public void aMethod() {
				System.out.println(
						"aMethod in an anonymous class in doIt() and i: " + i + ", j: " + j + " and m: " + m);
			}
		}.aMethod();
	}

	public static void doThat(int k) {

		class LocalClass2 {

			public LocalClass2() {
				System.out.println("\nin LocalClass2()");
			}

			public void doLocal() {
				System.out.println("in doLocal() and j: " + j + " and k: " + k);
			}
		}

		LocalClass2 o = new LocalClass2();
		o.doLocal();
	}
}

interface MyInterface {

	public void aMethod();
}
