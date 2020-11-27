package org.javaturk.oofp.ch10.properties;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import static org.javaturk.oofp.ch10.properties.PropertiesUtil.properties;
/**
 * Provide properties file info:
 * -DpropertiesFile="/Users/akin/Documents/Java/- Eclipse/Jee-Neon/workspace/Java SE WS/Java ile Nesne Merkezli ve Fonksiyonel Programlama/src/org/javaturk/oofp/ch08/properties/resources/captions.properties"
 * @author akin
 *
 */

public class LoginFrame extends JFrame implements ActionListener, MouseListener{
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu fileMenu = new JMenu(properties.getProperty("menu.file.title"));
	private JMenu editMenu = new JMenu(properties.getProperty("menu.edit.title"));
	private JMenu helpMenu = new JMenu(properties.getProperty("menu.help.title"));
	
	private JMenuItem newMenuItem = new JMenuItem(properties.getProperty("menu.menuItem.new.title"));
	private JMenuItem openMenuItem = new JMenuItem(properties.getProperty("menu.menuItem.open.title"));
	private JMenuItem closeMenuItem = new JMenuItem(properties.getProperty("menu.menuItem.close.title"));
	private JMenuItem aboutMenuItem = new JMenuItem(properties.getProperty("menu.menuItem.about.title"));
	private JMenuItem languageMenuItem = new JMenuItem(properties.getProperty("menu.menuItem.language.title"));
	
	private JPanel northPanel = new JPanel();
	private JPanel rolePanel = new JPanel();
	private JPanel centralPanel = new JPanel();
	private JPanel southPanel = new JPanel();
	
	private JLabel titleLabel = new JLabel(properties.getProperty("title.label"));
	
	private JLabel usernameLabel = new JLabel(properties.getProperty("username.label"), JLabel.RIGHT);
	private JLabel passwordLabel = new JLabel(properties.getProperty("password.label"), JLabel.RIGHT);
	private JLabel roleLabel = new JLabel(properties.getProperty("role.label"), JLabel.RIGHT);
	
	private JTextField usernameField = new JTextField(20);
	private JPasswordField passwordField = new JPasswordField(20);
	
	private JRadioButton adminRadioButton = new JRadioButton("Administrator");
	private JRadioButton powerUserRadioButton = new JRadioButton("Power User");
	private JRadioButton userRadioButton = new JRadioButton("User");
	private ButtonGroup group = new ButtonGroup();
	
	private JRadioButton readRadioButton = new JRadioButton("Read");
	private JRadioButton editRadioButton = new JRadioButton("Edit");
	private ButtonGroup menuGroup = new ButtonGroup();

	
	private JButton saveButton = new JButton(properties.getProperty("button.save.title"));
	private JButton clearButton = new JButton(properties.getProperty("button.clear.title"));
	private JButton cancelButton = new JButton(properties.getProperty("button.cancel.title"));	
	
	private Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	private Border raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
	
	public LoginFrame(String title) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
		super(title);
		setPanel();
		setSize(380, 240);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

		//UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
	}
	
	public void setPanel(){
		// First handle the menus
		setJMenuBar(menuBar);
		
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));

		
		newMenuItem.setMnemonic(KeyEvent.VK_N);
		newMenuItem.addActionListener(this);
		fileMenu.add(newMenuItem);
		
		openMenuItem.setMnemonic(KeyEvent.VK_O);
		openMenuItem.addActionListener(this);
		fileMenu.add(openMenuItem);	
		
		closeMenuItem.setMnemonic(KeyEvent.VK_C);
		closeMenuItem.addActionListener(this);
		fileMenu.add(closeMenuItem);
		
		languageMenuItem.setMnemonic(KeyEvent.VK_L);
		languageMenuItem.addActionListener(this);
		fileMenu.add(languageMenuItem);
		
		menuBar.add(fileMenu);

		editMenu.add(readRadioButton);
		editMenu.add(editRadioButton);
		readRadioButton.addActionListener(this);
		menuGroup.add(readRadioButton);
		editRadioButton.addActionListener(this);
		menuGroup.add(editRadioButton);
		
		menuBar.add(editMenu);
		
		
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
		aboutMenuItem.setMnemonic(KeyEvent.VK_A);
		aboutMenuItem.addActionListener(this);
		helpMenu.add(aboutMenuItem);
		
		menuBar.add(helpMenu);
		
		// Title
		titleLabel.setFont(new Font("Calibri", Font.BOLD, 18));
		titleLabel.setForeground(Color.black);

		northPanel.setBorder(loweredetched);
		northPanel.add(titleLabel);
		
		
		// Add label and fields to centralPanel
		centralPanel.setBorder(raisedetched);
		usernameLabel.setFont(new Font("Calibri", Font.BOLD, 16));
		usernameLabel.setForeground(Color.black);
		centralPanel.add(usernameLabel);
		centralPanel.add(usernameField);
		passwordLabel.setFont(new Font("Calibri", Font.BOLD, 16));
		passwordLabel.setForeground(Color.black);
		centralPanel.add(passwordLabel);
		centralPanel.add(passwordField);
		
		centralPanel.addMouseListener(this);
		
		roleLabel.setFont(new Font("Calibri", Font.BOLD, 16));
		
		rolePanel.add(roleLabel);
		rolePanel.add(adminRadioButton);
		rolePanel.add(powerUserRadioButton);
		userRadioButton.setSelected(true);
		rolePanel.add(userRadioButton);
		group.add(adminRadioButton);
		group.add(powerUserRadioButton);
		group.add(userRadioButton);
		centralPanel.add(rolePanel);
		
		
		// Add buttons to southPanel
		//southPanel.setBackground(Color.red);
		southPanel.setBorder(loweredetched);
		//saveButton.setBackground(new Color(255, 255, 210));
		saveButton.setFont(new Font("Calibri", Font.BOLD, 14));
		saveButton.setForeground(Color.black);
		saveButton.setActionCommand("Save");
		saveButton.addActionListener(this);
		southPanel.add(saveButton);
		
		//clearButton.setBackground(new Color(255, 255, 210));
		clearButton.setFont(new Font("Calibri", Font.BOLD, 14));
		clearButton.setForeground(Color.black);
		clearButton.setActionCommand("Clear");
		clearButton.addActionListener(this);
		southPanel.add(clearButton);
		
		//cancelButton.setBackground(new Color(255, 255, 210));
		cancelButton.setFont(new Font("Calibri", Font.BOLD, 14));
		cancelButton.setForeground(Color.black);
		cancelButton.setActionCommand("Cancel");
		cancelButton.addActionListener(this);
		southPanel.add(cancelButton);
		
		// Add panels to the frame
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		add(centralPanel, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if(command.equals("Save")){
			String username = usernameField.getText();
			String password = new String(passwordField.getPassword());
			String role = "";
			if(adminRadioButton.isSelected())
				role = "Administrator";
			else if(powerUserRadioButton.isSelected())
				role = "Power User";
			else if(userRadioButton.isSelected())
				role = "User";
			System.out.println(role + ": " + username + "/" + password);
		}
		else if(command.equals("Clear")){
			usernameField.setText("");
			passwordField.setText("");
			userRadioButton.setSelected(true);
		}
		else if(command.equals("Cancel")){
			close();
		}
		else if(command.equals("New")){
			JOptionPane.showMessageDialog(this, "New? Do you want something new?  :)");
		}
		else if(command.equals("Open")){
			JOptionPane.showMessageDialog(this, "Open What? :)");
		}
		else if(command.equals("Close")){
			close();
		}
		else if(command.equals("About")){
			JOptionPane.showMessageDialog(this, "A Swing example brought you by Akin KALDIROGLU");
		}
		else if(command.equals("Color")){
			String selectedString = (String)JOptionPane.showInputDialog(this, "Enter one:", "Input",
			                    JOptionPane.PLAIN_MESSAGE, null, null, "Ben");
			System.out.println("You entered: " + selectedString);
		}
		else if(command.equals("Read")){
			Object[] possibleValues = { "Ben", "Sen", "O", "Biz", "Siz", "Onlar" };
			Object selectedString = JOptionPane.showInputDialog(this, "Choose one:", "Input",
					JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
			System.out.println("You selected: " + selectedString);
		}
		else if(command.equals("Edit")){
			String selectedString = (String)JOptionPane.showInputDialog(this, "Enter one:", "Input",
			                    JOptionPane.PLAIN_MESSAGE, null, null, "Ben");
			System.out.println("You entered: " + selectedString);
		}
		else if(command.equals("Language")){
			String selectedString = (String)JOptionPane.showInputDialog(this, "Enter one:", "Input",
			                    JOptionPane.PLAIN_MESSAGE, null, null, "Ben");
			System.out.println("You entered: " + selectedString);
		}
	}
	
	public void close(){
		System.exit(1);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		LoginFrame frame = new LoginFrame("Login Frame");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println(x + "-" + y);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
