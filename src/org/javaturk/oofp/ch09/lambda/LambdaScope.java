package org.javaturk.oofp.ch09.lambda;

public class LambdaScope {
	
	private int i = 3;
	private String s = "Instance variable";
	private static boolean b = false; 

	public static void main(String[] args) {
		int i = 5;
		String s = "In main()";
		LambdaScope ls = new LambdaScope();
		
//		i++;
		//s = "I love Java!";
		
//		ScopeInterface si0 = (i, s) -> 5;	// Lambda expression's parameter i cannot redeclare another local variable defined in an enclosing scope. 
		
		ScopeInterface si1 = (ii, ss) -> {
//			int i = 10;  // Can not do this because i has already been defined in the larger scope!
//			String s = "In lambda expression!";  // Can not do this because s has already been defined in the larger scope!
			
//			System.out.println(m);   // Cannot be resolved to a variable.
			int m = 10;	// This is not a shadowing!
			int k = m;
			
			k += i;
			k += ls.i;
			ls.i++;
			k += ii;
			
			k += s.length();
			ls.s = "I love Java";
			k += ls.s.length();
			k += ss.length();
			return k;
		};
		
		int outcome = si1.f(100, ":)");
		System.out.println(outcome);
		
		ScopeInterface si2 = (ii, ss) -> {
			//System.out.println(m);
			int m = 10;	// This is not a shadowing!
			int k = m;
			
//			i++;		// Local variable i defined in an enclosing scope must be final or effectively final
//			s = ":)";	// Local variable s defined in an enclosing scope must be final or effectively final
//			ls = new LambdaScope();	// Local variable ls defined in an enclosing scope must be final or effectively final
			
			ls.i++;
			ls.s = "A new value!";
			
			k += i;
			k += ls.i;
			ii++;
			k += ii;
			
			LambdaScope.b = true;
			
			k += s.length();
			k += ls.s.length();
			ss = "I love Java";
			k += ss.length();
			return k;
		};
		
		System.out.println(si2.m);
		
		ScopeInterface si3 = (ii, ss) -> {System.out.println("in si3:" + ii + " " + ss);
											return 5;
										};
										
		si3.f(si2.m, "Ali");
		
		outcome = si2.f(100, ":)");
		System.out.println(outcome);
	}
}

@FunctionalInterface
interface ScopeInterface {
	int m = 1; // public static final
	
	public int f(int i, String s);
}
