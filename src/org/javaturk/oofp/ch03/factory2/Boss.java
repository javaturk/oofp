package org.javaturk.oofp.ch03.factory2;

public class Boss extends Person implements Worker{
	
	public Boss(String name){
		super(name);
	}
	
	public void youWorkToo(){
		System.out.println("Boss is working for you :)");
	}


	@Override
	public void work() {
		youWorkToo();
	}

	@Override
	public void live() {
		System.out.println("Just living :)");
	}
}
