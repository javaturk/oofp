package org.javaturk.oofp.ch03.compatibility;

public class TestCompatibility {

	public static void main(String[] args) {
		System.out.println();
		FootballPlayer player = new AverageFootballPlayer();
		player.play();
		player.behaveEthically();
	}
}
