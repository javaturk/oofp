package org.javaturk.oofp.ch03.factory1;

public class Boss implements Worker{
	
	public void youWorkToo(){
		System.out.println("Boss is working for you :)");
	}

	@Override
	public void work() {
		youWorkToo();
	}
}
