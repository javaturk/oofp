
package org.javaturk.oofp.ch04.anonymous.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * @author Akin Kaldiroglu (akin.kaldiroglu@selsoft.com.tr)
 *
 */
public class MyActionListener implements ActionListener{
	private MyApplication application;
	
	public MyActionListener(MyApplication application){
		this.application = application;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton button = (JButton) event.getSource();
		String buttonLabel = button.getText();
		application.buttonClicked(buttonLabel);
	}
}
