
package org.javaturk.oofp.ch09.examples.clock;

import java.util.Date;

public class ClockTest {

	public static void main(String[] args) {
		System.out.println("That's one time showing the clock:");
		Clock clock = () -> System.out.println(new Date());
//		clock.showClock();
		
		System.out.println("\nThat's the real-time clock:");
		Clock clock2 = () -> {
			Thread thread = new Thread(){
				@Override
				public void run(){
					while(true){
						System.out.println(new Date());
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			thread.start();
		};
		
//		clock2.showClock();
		
		
		Clock clock3 = () -> {
			Runnable runnable =() -> {
				while(true){
					System.out.println(new Date());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			Thread thread = new Thread(runnable);
			thread.start();
		};
		
		clock3.showClock();
	}
}
