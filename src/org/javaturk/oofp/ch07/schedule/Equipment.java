
package org.javaturk.oofp.ch07.schedule;

public class Equipment implements Schedulable{

	@Override
	public int getObjectId() {
		return (int) (Math.random() * (2^31));
	}

	@Override
	public void notifyAboutActivity() {
		System.out.println("Notification from an equipment.");
	}
}