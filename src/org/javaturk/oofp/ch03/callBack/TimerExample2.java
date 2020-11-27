package org.javaturk.oofp.ch03.callBack;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 * Excerpt From: Horstmann, Cay S. “Core Java Volume I--Fundamentals (9th
 * Edition): 1 (Core Series).” iBooks.
 *
 */

public class TimerExample2 {

	public static void main(String[] args){
		ActionListener listener1 = new TimePrinter2();
		Timer t1 = new Timer(1_000,  listener1);
//		t1.start();

		Timer t2 = new Timer(1_000,  new SelamPrinter2());
//		t2.start();
		
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				Toolkit.getDefaultToolkit().beep();		
			}
		};
		
		Timer t3 = new Timer(1_000,  new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Selaaammmm :)");
			}
			
		});
		t3.start();
		
		Timer t4 = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Naber abicim :)");		
			}
			
		});
//		t4.start();
		
		Timer t5 = new Timer(2000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("Selam :)");
			}
		});
//		t5.start();
		
//		t3.start();
//		
//		Timer t4 = new Timer(1000, (e ) ->  {
//			Date now = new Date();
//			System.out.println("At the tone, the time is " + now);
//			Toolkit.getDefaultToolkit().beep();	
//		});
//		
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

class TimePrinter2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Date now = new Date();
		System.out.println("At the tone, the time is " + now);
		Toolkit.getDefaultToolkit().beep();		
	}
}

class SelamPrinter2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Selaaammm :)");
		Toolkit.getDefaultToolkit().beep();		
	}
}