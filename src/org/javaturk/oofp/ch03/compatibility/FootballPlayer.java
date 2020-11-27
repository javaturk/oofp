package org.javaturk.oofp.ch03.compatibility;

public interface FootballPlayer {
	
	public void play();
	
//	void behaveEthically();

	public default void behaveEthically(){
		System.out.println("Default: I am behaving ethically!");
	}
}
