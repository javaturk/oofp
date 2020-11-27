package org.javaturk.oofp.ch11.generics;

import org.javaturk.oofp.ch11.domain.*;

public class Marriage<B extends Bride, G extends Groom> {
	private B bride;
	private G groom;

	public Marriage(B bride, G groom) {
		super();
		this.bride = bride;
		this.groom = groom;
	}

	public B getBride() {
		return bride;
	}

	public G getGroom() {
		return groom;
	}

	public static void main(String[] args) {

		Bride b1 = new Bride("Selin", "Mutlu");
		Groom g1 = new Groom("Selim", "Zeki");
		Marriage<Bride, Groom> m1 = new Marriage<>(b1, g1);
		System.out.println("Bride: " + m1.getBride());
		System.out.println("Groom: " + m1.getGroom());
	}
}

