
package org.javaturk.oofp.ch03.factory1.extension;

public class HardWorkingEmployee implements HardWorker{

	@Override
	public void work() {
		System.out.println("Employee is working!");
		
	}
	
	@Override
	public void workHard() {
		work();
		work();
		work();
	}
}
