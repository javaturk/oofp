package org.javaturk.oofp.ch03.compatibility;

public class AverageFootballPlayer implements FootballPlayer {
   
	@Override  
	public void play() {
		System.out.println("AverageFootballPlayer is playing football!");
	} 
	
	@Override
	public void behaveEthically(){
		System.out.println("I am behaving very very ethically!");
	}
}
