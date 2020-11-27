/**
 * 
 */
package org.javaturk.oofp.ch03.people.ability;

/**
 * @author akin
 *
 */

import org.javaturk.oofp.ch03.people.Engineer;

public class EngineerParentBloggerJavaEnthusiastInstrumentPlayer extends Engineer implements Parent, Blogger, JavaEnthusiast, InstrumentPlayer {

	public EngineerParentBloggerJavaEnthusiastInstrumentPlayer(String name, int age, String branch) {
		super(name, age, branch);
	}

	@Override
	public void writeBlog() {
		
	}

	@Override
	public void loveKids() {
		
	}

	@Override
	public void showCompassion() {
		
	}

	@Override
	public void giveSomeMonney() {
		
	}

	/**
	 * @author akin
	 * @param javaBook
	 * @see org.javaturk.oofp.ch04.people.ability.JavaEnthusiast#readAboutJava(java.lang.String)
	 */
	@Override
	public void readAboutJava(String javaBook) {
		
	}

	/**
	 * @author akin
	 * @see org.javaturk.oofp.ch04.people.ability.JavaEnthusiast#codeJava()
	 */
	@Override
	public void codeJava() {
		
	}

	/**
	 * @author akin
	 * @param instrument
	 * @see org.javaturk.oofp.ch04.people.ability.InstrumentPlayer#play(java.lang.String)
	 */
	@Override
	public void play(String instrument) {
		
	}
}

