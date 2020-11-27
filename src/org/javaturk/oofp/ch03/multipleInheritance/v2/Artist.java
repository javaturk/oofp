package org.javaturk.oofp.ch03.multipleInheritance.v2;

public interface Artist {
	
	default void play(){
		System.out.println("Artist plays!");
	}
}
