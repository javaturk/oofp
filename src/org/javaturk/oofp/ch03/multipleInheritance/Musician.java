package org.javaturk.oofp.ch03.multipleInheritance;

public interface Musician extends Artist{
	
	@Override
	default void play(){
		System.out.println("Musician plays!");
	}
}
