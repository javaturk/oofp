package org.javaturk.oofp.ch06.ex.closable;

public class ClosableClass implements AutoCloseable{
	private String name;
	private boolean open;
	
	public ClosableClass(String name, boolean b){
		System.out.println("Closable object is constructed: " + name);
		this.name = name;
		open = true;
		if(b){
			System.out.println("Throwing a RuntimeException!");
			throw new RuntimeException();
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closing ClosableClass object: " + name);
		open = false;
	}
	
	public void doSomething(){
		System.out.println("Doing something!");
	}
	
	public boolean isOpen(){
		return open;
	}
}
