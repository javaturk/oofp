package org.javaturk.oofp.ch03.multipleInheritance;

public interface Actor extends Artist{
	
	@Override
	default void play(){
		System.out.println("Actor plays!");
	}
}
