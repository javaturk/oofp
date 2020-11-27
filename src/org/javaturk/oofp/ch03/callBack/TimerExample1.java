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

public class TimerExample1 {

	public static void main(String[] args){
		ActionListener listener = new TimePrinter1();
		Timer t1 = new Timer(1_000,  listener);
//		t1.start();

		Timer t2 = new Timer(1_000,  new SelamPrinter1());
		t2.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

class TimePrinter1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Date now = new Date();
		System.out.println("At the tone, the time is " + now);
		Toolkit.getDefaultToolkit().beep();		
	}
}

class SelamPrinter1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Selaaammm :)");
		Toolkit.getDefaultToolkit().beep();		
	}
}