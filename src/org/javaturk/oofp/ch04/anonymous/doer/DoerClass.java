
package org.javaturk.oofp.ch04.anonymous.doer;

public class DoerClass implements DoerInterface {

	@Override
	public void doIt() {
		System.out.println("I always do it :)");
	}
	
	@Override
	public void doThat() {
		System.out.println("I always do that :)");
	}
}
