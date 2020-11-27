/**
 * 
 */
package org.javaturk.oofp.ch03.people.ability;

/**
 * @author akin
 *
 */

import org.javaturk.oofp.ch03.people.Engineer;

public class EngineerParentBloggerJavaEnthusiast extends Engineer implements Parent, Blogger, JavaEnthusiast {

	public EngineerParentBloggerJavaEnthusiast(String name, int age, String branch) {
		super(name, age, branch);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeBlog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loveKids() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showCompassion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void giveSomeMonney() {
		// TODO Auto-generated method stub
		
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
}

