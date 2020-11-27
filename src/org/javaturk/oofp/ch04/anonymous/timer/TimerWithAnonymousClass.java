package org.javaturk.oofp.ch04.anonymous.timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerWithAnonymousClass {

	public static void main(String[] args) {
		
		Timer t = new Timer(1_000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				Toolkit.getDefaultToolkit().beep();
			}
		});

		t.start();

		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
		
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				Toolkit.getDefaultToolkit().beep();
			}
		};
	}
}
